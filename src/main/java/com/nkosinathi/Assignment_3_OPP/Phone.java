package com.nkosinathi.Assignment_3_OPP;
/***
 * An ordinary landline phone:
 * ***/
public class Phone extends AbstractPhone {

    public Phone(int year) {
        super(year);
    }

    @Override
    public void call(int outgoingNumber) {
        System.out.println("Calling " + outgoingNumber);
    }

    @Override
    public void ring(int incomingNumber) {
        System.out.println("The phone is ringing");
    }
}
