package com.bbom.pattern.design.factory;

import com.bbom.pattern.design.factory.pizza.standard.Pizza;
import com.bbom.pattern.design.factory.pizzaStore.ChicagoPizzaStore;
import com.bbom.pattern.design.factory.pizzaStore.NYPizzaStore;
import com.bbom.pattern.design.factory.pizzaStore.PizzaStore;
import lombok.extern.slf4j.Slf4j;
@Slf4j
public class PizzaTestDrive {
    public void order() {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza nyCheesePizza = nyStore.orderPizza("cheese");
        log.info("찬복은 {} 를 주문했습니다.... \n", nyCheesePizza.getName());

        Pizza chicagoCheesepizza = chicagoStore.orderPizza("cheese");
        log.info("찬복은 {} 를 주문했습니다.... \n", chicagoCheesepizza.getName());

    }
}
