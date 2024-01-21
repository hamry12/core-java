package org.himanshu.basic.polymorphism;

public class PolymorphismOverLoading {

    public void showUserName(String name){
        System.out.println("Hi!, "+name);
    }

    public void showUserName(String firstname, String lastName){
        System.out.println("Hi!, "+firstname+" "+lastName);
    }
}
