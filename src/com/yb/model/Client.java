package com.yb.model;

import java.lang.reflect.InvocationHandler;

public class Client {
    public  static void main (String[] args){
        Subject subject=new RealSubject();
        InvocationHandler handler=new MyInvocationHandler(subject);
        //Subject proxy=DynamicProxy.newProxyInstance(subject.getClass().getClassLoader(),subject.getClass().getInterfaces(),handler);
        Subject proxy=SubjectDynamicProxy.newProxyInstance(subject);
        proxy.doSomething("Fimish");
    }
}
