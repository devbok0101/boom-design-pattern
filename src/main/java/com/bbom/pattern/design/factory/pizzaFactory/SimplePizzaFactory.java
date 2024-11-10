package com.bbom.pattern.design.factory.pizzaFactory;

import com.bbom.pattern.design.factory.pizza.standard.*;

public class SimplePizzaFactory {
    public Pizza createPizza(String type) {
        Pizza pizza = null;

        if (type.equals("cheese")) pizza = new CheesePizza();
        if (type.equals("pepperoni")) pizza = new PepperpniPizza();
        if (type.equals("clam")) pizza =  new ClamPizza();
        if (type.equals("egg")) pizza =  new EggPizza();

        return pizza;
    }
}
