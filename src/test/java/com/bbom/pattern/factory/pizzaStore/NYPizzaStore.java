package com.bbom.pattern.factory.pizzaStore;

import com.bbom.pattern.factory.pizza.nystyle.NYStyleClamPizza;
import com.bbom.pattern.factory.pizza.nystyle.NYStylePepperoniPizza;
import com.bbom.pattern.factory.pizza.nystyle.NYStyleVeggiePizza;
import com.bbom.pattern.factory.pizza.nystyle.NYStypeCheesePizza;
import com.bbom.pattern.factory.pizza.standard.*;

public class NYPizzaStore extends PizzaStore{
    @Override
    Pizza createPizza(String type) {
        Pizza pizza = null;

        if (type.equals("cheese")) pizza = new NYStypeCheesePizza();
        if (type.equals("pepperoni")) pizza = new NYStylePepperoniPizza();
        if (type.equals("clam")) pizza =  new NYStyleClamPizza();
        if (type.equals("veggie")) pizza =  new NYStyleVeggiePizza();

        return pizza;
    }
}
