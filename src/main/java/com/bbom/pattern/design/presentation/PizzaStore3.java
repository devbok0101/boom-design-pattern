package com.bbom.pattern.design.presentation;

import com.bbom.pattern.design.factory.pizza.standard.Pizza;
import com.bbom.pattern.design.presentation.pizzaFactory.ChicagoPizzaFactory;
import com.bbom.pattern.design.presentation.pizzaFactory.NYPizzaFactory;
import com.bbom.pattern.design.presentation.pizzaFactory.SimplePizzaFactory;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class PizzaStore3 {

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
