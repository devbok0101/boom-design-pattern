package com.bbom.pattern.factory;

public class Pizza {


    public Pizza orderPizza(String type) {
        Pizza pizza = new Pizza();

        if (type.equals("cheese")) return new CheesePizza();
        if (type.equals("greek")) return new GreekPizza();
        if (type.equals("pepperoni")) return new PepperpniPizza();

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
