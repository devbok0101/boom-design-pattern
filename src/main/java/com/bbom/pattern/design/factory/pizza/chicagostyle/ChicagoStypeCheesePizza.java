package com.bbom.pattern.design.factory.pizza.chicagostyle;

import com.bbom.pattern.design.factory.pizza.standard.Pizza;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ChicagoStypeCheesePizza extends Pizza {
    public ChicagoStypeCheesePizza() {
        this.name = "시카고 스타일 딥 디쉬 치즈 핏짜";
        this.dough = "충분히 두껍고 바삭한 도우";
        this.sauce = "플럼 토마토 소스";

        toppings.add("슈레드 모짜렐라 치즈");
    }

    public void cut() {
        log.info("피자를 네모난 모양으로 자릅니다....");
    }
}
