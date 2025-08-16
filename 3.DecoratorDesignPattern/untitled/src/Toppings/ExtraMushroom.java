package Toppings;

import Pizza.BasePizza;

public class ExtraMushroom extends ToppingsDecorator{

    BasePizza pizza;
    public ExtraMushroom(BasePizza basePizza){
        this.pizza = basePizza;
    }
    @Override
    public int cost() {
        return this.pizza.cost() + 29;
    }
}
