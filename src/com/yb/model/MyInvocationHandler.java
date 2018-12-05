package com.yb.model;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyInvocationHandler implements InvocationHandler{
    Class clas=null;
    Object object=null;
    public MyInvocationHandler(Object _obj){
        this.object=_obj;
    }
    @Override
    public Object invoke(Object proxy, Method method ,Object[] args)throws Throwable{
            Object result=method.invoke(this.object,args);
            return result;
    }

}
