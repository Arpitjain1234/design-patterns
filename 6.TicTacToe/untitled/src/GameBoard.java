public class GameBoard {

    int length;
    int breadth;
    GamePieces[][] gameboard;

    boolean [][] occupied_positions;

    boolean isOccupied(int row, int col){
        return  occupied_positions[row][col];
    }
    GameBoard(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
        this.gameboard = new GamePieces[length][breadth];

        if(occupied_positions == null){
            occupied_positions = new boolean[length][breadth];
        }

    }

    void addGamePiece(int row, int col, GamePieces gamepiece ){
        if(!occupied_positions[row][col]){
            this.gameboard[row][col] = gamepiece;
            occupied_positions[row][col] = true;
        }
        else{
            System.out.println("Position already occupied");
        }
    }
    boolean winnerFound() {
        // Check columns
        for (int i = 0; i < length; i++) {
            if (gameboard[0][i] != null) {
                GamePieces g = gameboard[0][i];
                boolean found = true;
                for (int j = 1; j < breadth; j++) {
                    if (gameboard[j][i] != g) {
                        found = false;
                        break;
                    }
                }
                if (found) return true;
            }
        }

        // Check rows
        for (int i = 0; i < breadth; i++) {
            if (gameboard[i][0] != null) {
                GamePieces g = gameboard[i][0];
                boolean found = true;
                for (int j = 1; j < length; j++) {
                    if (gameboard[i][j] != g) {
                        found = false;
                        break;
                    }
                }
                if (found) return true;
            }
        }

        // Check main diagonal
        if (gameboard[0][0] != null) {
            GamePieces g = gameboard[0][0];
            boolean found = true;
            for (int i = 1; i < length; i++) {
                if (gameboard[i][i] != g) {
                    found = false;
                    break;
                }
            }
            if (found) return true;
        }

        // Check anti-diagonal
        if (gameboard[0][length - 1] != null) {
            GamePieces g = gameboard[0][length - 1];
            boolean found = true;
            for (int i = 1; i < length; i++) {
                if (gameboard[i][length - i - 1] != g) {
                    found = false;
                    break;
                }
            }
            if (found) return true;
        }

        return false; // No winner found
    }
    void printBoard() {
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < breadth; j++) {
                if (gameboard[i][j] != null)
                    System.out.print(gameboard[i][j] + " ");
                else
                    System.out.print("- ");
            }
            System.out.println();
        }
    }




}
