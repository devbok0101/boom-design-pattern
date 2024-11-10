package com.bbom.pattern.design.presentation;

import com.bbom.pattern.design.factory.pizza.standard.*;
import com.bbom.pattern.design.presentation.pizzaFactory.SimplePizzaFactory;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class PizzaStore2 {

    private SimplePizzaFactory simplePizzaFactory;

    public Pizza orderPizza(String type) {

        Pizza pizza = null;

        pizza = simplePizzaFactory.createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.box();
        return pizza;

    }
}
