import Pizza.BasePizza;
import Pizza.MargerritaPizza;
import Toppings.ExtraCheese;

public class Main {
    public static void main(String[] args) {


        // finding the cost of the margeritta pizza
        MargerritaPizza pizza = new MargerritaPizza();
        System.out.println("Price is " + pizza.cost());


        // finding the cost with extraCheese;
        ExtraCheese extraCheesePizza = new ExtraCheese(pizza);
        System.out.println("The cost of this combination is "+ extraCheesePizza.cost());

        //
    }
}