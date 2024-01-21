package org.himanshu.basic.abstraction;

public class AbstractionImpl extends AbstractExample{

    @Override
    public void on() {
        System.out.println("Switched On!");
    }

    @Override
    public void off() {
        System.out.println("Switched Off!");
    }
}
