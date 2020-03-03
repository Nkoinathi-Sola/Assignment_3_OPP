package com.nkosinathi.Assignment_3_OPP;

/***
 * Encapsulation and access control
 *
 *
 * Suppose that information about a phone (its production year or the manufacturer's logo)
 * is engraved on its back when it is made. The information (its state) is specific to this
 * particular model. We can say that the manufacturer made sure this information was immutable
 * — it's unlikely that anyone would think to remove the engraving.
 *
 * In the Java world, a class describes the state of future objects using fields, and their
 * behavior is described using methods. Access to an object's state and behavior is controlled
 * using modifiers applied to fields and methods: private, protected, public, and default.
 * For example, we decided that the production year, manufacturer name, and one of the methods
 * are internal implementation details of the class and cannot be changed by other objects in the program.
 *
 * In code, the class can be described as follows:
 * ***/

public class SomePhone {

    private int year;
    private String company;
    public SomePhone(int year, String company) {
        this.year = year;
        this.company = company;
    }
    private void openConnection(){
        // findSwitch
        // openNewConnection...
    }
    public void call() {
        openConnection();
        System.out.println("Calling");
    }

    public void ring() {
        System.out.println("Ring-ring");
    }

}
