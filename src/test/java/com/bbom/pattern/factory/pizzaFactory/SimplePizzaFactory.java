package com.bbom.pattern.factory.pizzaFactory;

import com.bbom.pattern.factory.*;

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
