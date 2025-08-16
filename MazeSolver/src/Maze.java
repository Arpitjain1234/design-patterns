public class Maze {
    private  final int[][] grid;
    int rows,cols;
    private  Position start,exit;

    Maze(int [][]grid,Position start,Position exit){
        this.start = start;
        this.exit = exit;
        this.grid = grid;
    }
    public boolean isvalid(Position p){
        int cur_row = p.row;
        int cur_col = p.col;
        return  (cur_col<cols && cur_col>=0 && cur_row<rows && cur_row>=0);
    }



}
