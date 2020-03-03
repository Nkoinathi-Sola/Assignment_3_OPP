package com.nkosinathi.Assignment_3_OPP;
/***
 * Using abstraction, we can now identify the general information in this object hierarchy:
 * the general abstract object (telephone), common characteristics of the telephone
 * (e.g. year of its creation), and the common interface (all telephones can receive and make calls).
 * ***/
public abstract class AbstractPhone {
    private int year;

    public AbstractPhone(int year) {
        this.year = year;
    }
    public abstract void call(int outgoingNumber);
    public abstract void ring(int incomingNumber);
}