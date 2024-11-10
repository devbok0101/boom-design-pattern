package com.bbom.pattern.factory.pizzaStore;

import com.bbom.pattern.factory.pizza.standard.Pizza;

public abstract class PizzaStore {

    public Pizza orderPizza(String type) {

        Pizza pizza;

        pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.box();
        return pizza;

    }

    abstract Pizza createPizza(String type);
}
