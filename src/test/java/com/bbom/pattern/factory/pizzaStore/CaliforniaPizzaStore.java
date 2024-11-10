package com.bbom.pattern.factory.pizzaStore;

import com.bbom.pattern.factory.pizza.standard.*;

public class CaliforniaPizzaStore extends PizzaStore{
    @Override
    Pizza createPizza(String type) {
        Pizza pizza = null;

        if (type.equals("cheese")) pizza = new CheesePizza();
        if (type.equals("pepperoni")) pizza = new PepperpniPizza();
        if (type.equals("clam")) pizza =  new ClamPizza();
        if (type.equals("egg")) pizza =  new EggPizza();

        return pizza;
    }
}
