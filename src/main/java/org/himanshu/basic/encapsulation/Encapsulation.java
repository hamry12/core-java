package org.himanshu.basic.encapsulation;

/**
 * @author Himanshu Singh
 * This is an example of Encapsulation where the fields are of private access-modifier.
 * In order to access these fields we use getters and setters to restrict the direct access of field.
 */

public class Encapsulation {
    private String firstName;
    private String lastname;

    public Encapsulation(String firstName, String lastname) {
        this.firstName = firstName;
        this.lastname=lastname;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}
