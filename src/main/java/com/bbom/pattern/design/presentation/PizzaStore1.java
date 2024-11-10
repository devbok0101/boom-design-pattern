package com.bbom.pattern.design.presentation;

import com.bbom.pattern.design.factory.pizza.standard.*;

public class PizzaStore1 {
    public Pizza orderPizza(String type) {

        Pizza pizza = null;

        if (type.equals("cheese")) pizza = new CheesePizza();
        if (type.equals("pepperoni")) pizza = new PepperpniPizza();
        if (type.equals("clam")) pizza = new ClamPizza();
        if (type.equals("egg")) pizza = new EggPizza();

        pizza.prepare();
        pizza.bake();
        pizza.box();
        return pizza;

    }
}
