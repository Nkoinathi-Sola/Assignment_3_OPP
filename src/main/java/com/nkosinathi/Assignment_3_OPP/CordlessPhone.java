package com.nkosinathi.Assignment_3_OPP;
/***
 * Inheritance
 *
 * What we have here is inheritance of object properties.
 *
 * In programming, inheritance means to use existing classes to define new ones.
 *
 * Let's consider an example of using inheritance to create a smartphone class.
 * All cordless phones are powered by rechargeable batteries, which have a certain battery life.
 * Accordingly, we add this property to the cordless phone class:
 * ***/

public abstract class CordlessPhone extends AbstractPhone {

    private int hour;

    public CordlessPhone (int year, int hour) {
        super(year);
        this.hour = hour;
    }
}