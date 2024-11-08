package com.bbom.pattern.factory;

public class Pizza {


    public Pizza orderPizza(String type) {
        Pizza pizza = new Pizza();

        if (type.equals("cheese")) return new CheesePizza();
        if (type.equals("pepperoni")) return new PepperpniPizza();
        if (type.equals("clam")) return new ClamPizza();
        if (type.equals("egg")) return new EggPizza();

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
