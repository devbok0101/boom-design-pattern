package com.bbom.pattern.design.factory.pizza.nystyle;

import com.bbom.pattern.design.factory.pizza.standard.Pizza;

public class NYStypeCheesePizza extends Pizza{

    public NYStypeCheesePizza() {
        this.name = "뉴욕 스타일 소스의 치즈 핏짜";
        this.dough = "얇고 바삭한 도우";
        this.sauce = "마리나라 소스";

        this.toppings.add("잘게 썬 풍미 좋은 레지아노 치즈");
    }
}
