package com.lm2a.genericos;

public class Test1<T, U> {
    T objT;
    U objU;

    public Test1(T objT, U objU) {
        this.objT = objT;
        this.objU = objU;
    }

    public void print(){
        System.out.println(objT);
        System.out.println(objU);
    }
}
