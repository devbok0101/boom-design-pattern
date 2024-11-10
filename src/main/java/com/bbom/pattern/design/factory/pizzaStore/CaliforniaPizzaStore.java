package com.bbom.pattern.design.factory.pizzaStore;

import com.bbom.pattern.design.factory.pizza.standard.*;

public class CaliforniaPizzaStore extends PizzaStore{
    @Override
    Pizza createPizza(String type) {
        if (type.equals("cheese")) return new CheesePizza();
        if (type.equals("pepperoni")) return new PepperpniPizza();
        if (type.equals("clam")) return  new ClamPizza();
        if (type.equals("egg")) return  new EggPizza();
        return null;
    }
}
