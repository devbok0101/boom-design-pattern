package com.bbom.pattern.design.factory.pizzaStore;


import com.bbom.pattern.design.factory.pizza.nystyle.NYStyleClamPizza;
import com.bbom.pattern.design.factory.pizza.nystyle.NYStylePepperoniPizza;
import com.bbom.pattern.design.factory.pizza.nystyle.NYStyleVeggiePizza;
import com.bbom.pattern.design.factory.pizza.nystyle.NYStypeCheesePizza;
import com.bbom.pattern.design.factory.pizza.standard.*;

public class NYPizzaStore extends PizzaStore{
    @Override
    Pizza createPizza(String type) {
        if (type.equals("cheese")) return new NYStypeCheesePizza();
        if (type.equals("pepperoni")) return new NYStylePepperoniPizza();
        if (type.equals("clam")) return  new NYStyleClamPizza();
        if (type.equals("veggie")) return  new NYStyleVeggiePizza();

        return null;
    }
}
