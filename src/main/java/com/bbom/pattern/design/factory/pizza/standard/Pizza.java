package com.bbom.pattern.design.factory.pizza.standard;


import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Getter
public abstract class Pizza {

    protected String name;
    protected String dough;
    protected String sauce;
    protected List<String> toppings = new ArrayList<>();

    public void box() {
        log.info("지정된 프랜차이즈 전용 피자 박스에 피자를 놓습니다....");
    }

    public void bake() {
        log.info("350도에 피자를 25분간 굽습니다.....");
    }

    public void prepare() {
        log.info("{} 피자를 준비합니다......", this.name);
        log.info("도우를 준비합니다......");
        log.info("소스를 추가합니다......");
        toppings.forEach(topping -> log.info("{}을 추가합니다.....", topping));
    }
}
