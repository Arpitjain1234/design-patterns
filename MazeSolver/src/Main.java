import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        int[][] grid = {
                {0, 0, 1, 0},
                {1, 0, 1, 0},
                {1, 0, 0, 0},
                {1, 1, 1, 0}
        };

        Position start = new Position(0, 0);
        Position exit = new Position(3, 3);
        Maze maze = new Maze(grid, start, exit);

        SolverMultithreading solver = new SolverMultithreading();
        List<Position> solution = solver.solve(maze, start, exit);

        if (solution != null) {
            System.out.println("\nSolved Path:");
            for (Position pos : solution) {
                System.out.println("→ (" + pos.row + ", " + pos.col + ")");
            }
        } else {
            System.out.println("No solution found.");
        }
    }
}
