package com.bbom.pattern.design.presentation;

import com.bbom.pattern.design.factory.pizza.chicagostyle.ChicagoStylePepperoniPizza;
import com.bbom.pattern.design.factory.pizza.chicagostyle.ChicagoStyleVeggiePizza;
import com.bbom.pattern.design.factory.pizza.chicagostyle.ChicagoStypeCheesePizza;
import com.bbom.pattern.design.factory.pizza.nystyle.NYStyleClamPizza;
import com.bbom.pattern.design.factory.pizza.nystyle.NYStylePepperoniPizza;
import com.bbom.pattern.design.factory.pizza.nystyle.NYStyleVeggiePizza;
import com.bbom.pattern.design.factory.pizza.nystyle.NYStypeCheesePizza;
import com.bbom.pattern.design.factory.pizza.standard.*;

public class DependentPizzaStore {
    public Pizza orderPizza(String style, String type) {

        Pizza pizza = null;

        if("NY".equals(style)) {
            if (type.equals("cheese")) pizza = new NYStypeCheesePizza();
            if (type.equals("pepperoni")) pizza = new NYStylePepperoniPizza();
            if (type.equals("clam")) pizza = new NYStyleClamPizza();
            if (type.equals("veggie")) pizza = new NYStyleVeggiePizza();
        } else if ("Chicago".equals(style)) {
            if (type.equals("cheese")) pizza = new ChicagoStypeCheesePizza();
            if (type.equals("pepperoni")) pizza = new ChicagoStylePepperoniPizza();
            if (type.equals("clam")) pizza = new ChicagoStyleVeggiePizza();
            if (type.equals("veggie")) pizza = new ChicagoStyleVeggiePizza();
        }

        pizza.prepare();
        pizza.bake();
        pizza.box();
        return pizza;

    }
}
