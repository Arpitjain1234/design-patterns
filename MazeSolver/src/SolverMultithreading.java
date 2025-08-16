import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class SolverMultithreading implements MazeSolverStrategy {
    private Maze maze;
    private Position start;
    private Position exit;

    private volatile boolean isSolutionFound = false;
    private List<Position> solutionPath = null;

    private boolean[][] visited;
    private ExecutorService pool;
    private final Object lock = new Object();

    @Override
    public List<Position> solve(Maze maze, Position start, Position exit) throws InterruptedException {
        this.maze = maze;
        this.start = start;
        this.exit = exit;
        this.visited = new boolean[maze.rows][maze.cols];

        int cores = Runtime.getRuntime().availableProcessors();
        this.pool = Executors.newFixedThreadPool(cores);

        for (Directions dir : Directions.values()) {
            Position next = new Position(start.row + dir.dr, start.col + dir.dc);
            if (maze.isvalid(next)) {
                List<Position> path = new ArrayList<>();
                path.add(start);
                pool.submit(() -> explore(next, path));
            }
        }

        pool.shutdown();
        pool.awaitTermination(1, TimeUnit.MINUTES);
        return solutionPath;
    }

    private void explore(Position current, List<Position> path) {
        synchronized (lock) {
            if (isSolutionFound || !maze.isvalid(current) || visited[current.row][current.col]) return;
            visited[current.row][current.col] = true;
        }

        path.add(current);

        if (current.equals(exit)) {
            synchronized (lock) {
                if (!isSolutionFound) {
                    isSolutionFound = true;
                    solutionPath = new ArrayList<>(path);
                    System.out.println("The solution path is:");
                    for (Position p : solutionPath) {
                        System.out.println("Row: " + p.row + ", Col: " + p.col);
                    }
                    pool.shutdownNow();
                }
            }
            return;
        }

        for (Directions dir : Directions.values()) {
            Position neighbor = new Position(current.row + dir.dr, current.col + dir.dc);
            synchronized (lock) {
                if (maze.isvalid(neighbor) && !visited[neighbor.row][neighbor.col]) {
                    List<Position> newPath = new ArrayList<>(path);
                    pool.submit(() -> explore(neighbor, newPath));
                }
            }
        }
    }
}
