package org.himanshu.basic;

import org.himanshu.basic.abstraction.AbstractExample;
import org.himanshu.basic.abstraction.AbstractionImpl;
import org.himanshu.basic.abstraction.InterfaceExample;
import org.himanshu.basic.abstraction.InterfaceImpl;
import org.himanshu.basic.encapsulation.Encapsulation;
import org.himanshu.basic.inheritance.ChildClass;
import org.himanshu.basic.inheritance.ParentClass;
import org.himanshu.basic.polymorphism.PolymorphismOverLoading;

/**
 * This class is an example to demonstrate the pillars of OOP.
 *
 * <p>The pillars of OOP are:</p>
 * <ol>
 *   <li>Encapsulation</li>
 *   <li>Inheritance</li>
 *   <li>Polymorphism</li>
 *   <li>Abstraction</li>
 * </ol>
 *
 * @author Himanshu Singh
 */
public class BasicMain{
    /**
     * The main method is the entry point of the program.
     *
     * @param args Command line arguments.
     */
    public static void main(String[] args) {

        // 1. Encapsulation Example
        Encapsulation encapsulation= new Encapsulation("Himanshu", "Singh");
        System.out.println(encapsulation.getFirstName()+"\t"+encapsulation.getLastname());

        // 2. Polymorphism Overloading Example
        PolymorphismOverLoading overLoading= new PolymorphismOverLoading();
        overLoading.showUserName("Himanshu");
        overLoading.showUserName("Himanshu", "Singh");

        // 3. Inheritance Using Extends
        ParentClass parentClass= new ParentClass();
        parentClass.parentMethod(); // This will invoke method from parent class

        ChildClass childClass= new ChildClass();
        childClass.parentMethod(); // This will invoke method from Child class

        /**
         * This will invoke method from Child class, though
         * we are referring from the parent class but Object of
         * child class is being invoked
         */
        ParentClass parentClass1= new ChildClass();
        parentClass1.parentMethod();

        /**
         *  Vice-versa for the same could not be achieved due to higher order hierarchy.
         */
//        ChildClass childClass1= new ParentClass();

        /**
         *  The Parent Class can not access the methods from Child class.
         *  This will throw no-method reference found.
         */
//        parentClass1.childMethod();

        // 4. Abstraction using Abstract class and Interface
        AbstractionImpl abstractExample= new AbstractionImpl();
        abstractExample.on();
        abstractExample.off();

        // On the other Hand Interface needs to implemented using implements keyword.
        InterfaceExample interfaceExample=new InterfaceImpl();
        interfaceExample.pay();
        interfaceExample.viewBalance();
        interfaceExample.addCoupon();
    }

}
