public class Board {
    Cell[][] board;

    Board(int length,int breadth){
        this.board = new Cell[length][breadth];
        //settiing up the board
        for(int i = 0; i<length; i++){
            for(int j = 0;j <breadth; j++){
                board[i][j] = new Cell();
            }
        }
    }

}
