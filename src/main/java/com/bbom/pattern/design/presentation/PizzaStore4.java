package com.bbom.pattern.design.presentation;

import com.bbom.pattern.design.factory.pizza.standard.Pizza;
import com.bbom.pattern.design.presentation.pizzaFactory.SimplePizzaFactory;
import lombok.AllArgsConstructor;

public abstract class PizzaStore4 {

    public Pizza orderPizza(String type) {

        Pizza pizza = null;

        pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.box();
        return pizza;

    }

    abstract Pizza createPizza(String type);
}
