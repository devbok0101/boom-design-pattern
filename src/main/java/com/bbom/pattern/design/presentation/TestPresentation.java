package com.bbom.pattern.design.presentation;

import com.bbom.pattern.design.presentation.pizzaFactory.ChicagoPizzaFactory;
import com.bbom.pattern.design.presentation.pizzaFactory.NYPizzaFactory;

public class TestPresentation {
    public static void main(String[] args) {
        PizzaStore3 nyPizzaStore = new PizzaStore3(new NYPizzaFactory());
        nyPizzaStore.orderPizza("cheese");
        PizzaStore3 chicagoPizzaStore = new PizzaStore3(new ChicagoPizzaFactory());
        chicagoPizzaStore.orderPizza("cheese");
    }
}
