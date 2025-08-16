package Toppings;

import Pizza.BasePizza;

public class ExtraCheese extends  ToppingsDecorator{
    BasePizza pizza;


    public ExtraCheese(BasePizza basePizza){
        this.pizza = basePizza;
    }
    @Override
    public int cost() {
        return  this.pizza.cost() + 45;
    }
}
