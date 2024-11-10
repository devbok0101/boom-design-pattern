package com.bbom.pattern.factory;

import com.bbom.pattern.factory.pizzaFactory.SimplePizzaFactory;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Pizza {

    SimplePizzaFactory simplePizzaFactory;


    public Pizza orderPizza(String type) {

        Pizza pizza;

        pizza = simplePizzaFactory.createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.box();
        return pizza;

    }

    private void box() {
    }

    private void bake() {
    }

    private void prepare() {
    }
}
