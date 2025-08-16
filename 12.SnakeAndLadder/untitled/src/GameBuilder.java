import java.util.LinkedList;
import java.util.Queue;

public class GameBuilder {
    int length = 5;
    int breadth = 5;
    int playerCount = 2;



    Board gameBoard = new Board(length,breadth);
    Queue<Player> playerQueue = new LinkedList<>();

    Player player1 = new Player("Player1");
    Player player2 = new Player("Player2");

    GameBuilder(){
        playerQueue.add(player1);
        playerQueue.add(player2);
        

    }


}
