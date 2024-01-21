package org.himanshu.basic.inheritance;

public class ChildClass extends ParentClass{

    @Override
    public void parentMethod() {
        super.parentMethod();
        System.out.println("This is a overridden Method extended to Child Class");
    }

    public void childMethod(){
        System.out.println("Child Class Method");
    }
}
