import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class TicTacToeGame {

    Deque<Player> playerDeque = new ArrayDeque<>();
    GameBoard gameBoard = new GameBoard(3,3);

    Player player1 = new PlayerX(GamePieces.X);
    Player player2 = new PlayerO(GamePieces.O);

    boolean winnerFound  = false;

    public void startGame() {
        playerDeque.add(player1);
        playerDeque.add(player2);
        Scanner sc = new Scanner(System.in);
        while (!winnerFound) {
            Player currentPlayer = playerDeque.pollFirst();
            boolean validMove = false;
            while (!validMove) {
                System.out.print("Enter the row and column: ");
                int row = sc.nextInt();
                int col = sc.nextInt();
                if (row < 0 || row >= 3 || col < 0 || col >= 3) {
                    System.out.println("Invalid position. Try again.");
                    continue;
                }

                if (!gameBoard.isOccupied(row, col)) {
                    gameBoard.addGamePiece(row, col, currentPlayer.gamepiece);
                    validMove = true;
                    gameBoard.printBoard();
                } else {
                    System.out.println("Cell already occupied. Try again.");
                }
            }
            winnerFound = gameBoard.winnerFound();
            if(winnerFound){
                System.out.println("The winner of the game is :" + currentPlayer.gamepiece);
                break;
            }
            playerDeque.addLast(currentPlayer);
        }
        sc.close();

        }



}
