package com.yb.model;

public class BeforeAdvice implements IAdvice {
    @Override
    public void exec(){
        System.out.println("我是前置");
    }
}
