package com.bbom.pattern.design.factory.pizzaStore;

import com.bbom.pattern.design.factory.pizza.chicagostyle.ChicagoStylePepperoniPizza;
import com.bbom.pattern.design.factory.pizza.chicagostyle.ChicagoStyleVeggiePizza;
import com.bbom.pattern.design.factory.pizza.chicagostyle.ChicagoStypeCheesePizza;
import com.bbom.pattern.design.factory.pizza.standard.Pizza;

public class ChicagoPizzaStore extends PizzaStore{
    @Override
    Pizza createPizza(String type) {
        if (type.equals("cheese")) return new ChicagoStypeCheesePizza();
        if (type.equals("pepperoni")) return new ChicagoStylePepperoniPizza();
        if (type.equals("clam")) return  new ChicagoStyleVeggiePizza();
        if (type.equals("veggie")) return  new ChicagoStyleVeggiePizza();

        return null;
    }
}
