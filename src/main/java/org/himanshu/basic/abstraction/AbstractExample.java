package org.himanshu.basic.abstraction;

/**
 * @author Himanhshu
 * -> Abstract Class can have abstract method as well as non-abstract method.
 * -> Abstraction means hiding the implemnetation detail and display the functionality.
 * -> abstract methods needs to defined explicitly with "abstract" key.
 * -> Multiple Inheritance could not be achieved due to limitation of extending a class.
 */

public abstract class AbstractExample {

    public abstract void on();
    public abstract void off();

    public void display(){
        System.out.println("This is a normal Non-Abstract method in Abstract class");
    }

}
