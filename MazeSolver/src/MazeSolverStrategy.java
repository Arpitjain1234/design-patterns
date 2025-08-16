import java.util.List;

public interface MazeSolverStrategy {



    List<Position> solve(Maze maze ,Position start,Position end)throws InterruptedException;
}
