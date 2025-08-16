import java.util.Random;

public class Dice {
    int numberOfDice;
    public Dice(int numberOfDice){
        this.numberOfDice = numberOfDice;
    }

    private int rolldice(){
        int totalsum = 0;
        int dice = 0;
        while(dice<numberOfDice){
            Random rand = new Random();
            int nextnum = rand.nextInt(6)+1; //btw 1 and 6;
            totalsum = totalsum + nextnum;
            dice++;
        }
        return  totalsum;
    }
}
