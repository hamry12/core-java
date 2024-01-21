package org.himanshu.basic.abstraction;

/**
 * @author Himanshu
 * -> Unlike Abstract Class Interface allows only abstract methods.
 * -> No explicit key needs to be mentioned.
 * -> Multiple Inheritance can be achieved through this as we can implement multiple interface.
 * -> But it can have multiple static and default methods after introduction to Java 8.
 */
public interface InterfaceExample {
    public void pay();
    public void viewBalance();

    public default void addCoupon(){
        System.out.println(" Coupon Applied");
    }
}
