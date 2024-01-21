package org.himanshu.basic.abstraction;

/**
 * methods pay and viewBalance needs to implemented whereas addCoupon is optional.
 */
public class InterfaceImpl implements InterfaceExample {


    @Override
    public void pay() {
        System.out.println("X amount Paid!");
    }

    @Override
    public void viewBalance() {
        System.out.println("Current Balance Y");
    }

    @Override
    public void addCoupon() {
        System.out.println(" Optional Default add Coupon Method");
    }
}
