package com.hillel.lesson10.classwork;

public abstract class ParentAbstractClass {
    private String value;

    public abstract void abstractMethod();
    public void notAbstractMethod(){
        System.out.println("I'm not abstract");
    }
}
