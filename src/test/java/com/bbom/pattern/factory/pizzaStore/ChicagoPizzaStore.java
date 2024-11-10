package com.bbom.pattern.factory.pizzaStore;

import com.bbom.pattern.factory.pizza.chicagostyle.ChicagoStylePepperoniPizza;
import com.bbom.pattern.factory.pizza.chicagostyle.ChicagoStyleVeggiePizza;
import com.bbom.pattern.factory.pizza.chicagostyle.ChicagoStypeCheesePizza;
import com.bbom.pattern.factory.pizza.standard.*;

public class ChicagoPizzaStore extends PizzaStore{
    @Override
    Pizza createPizza(String type) {
        Pizza pizza = null;

        if (type.equals("cheese")) pizza = new ChicagoStypeCheesePizza();
        if (type.equals("pepperoni")) pizza = new ChicagoStylePepperoniPizza();
        if (type.equals("clam")) pizza =  new ChicagoStyleVeggiePizza();
        if (type.equals("veggie")) pizza =  new ChicagoStyleVeggiePizza();

        return pizza;
    }
}
