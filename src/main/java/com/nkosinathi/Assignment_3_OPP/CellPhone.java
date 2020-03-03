package com.nkosinathi.Assignment_3_OPP;
/***
 * Cell phones inherit the properties of a cordless phone, and we implement the call and ring methods in this class:
 * ***/
public class CellPhone extends CordlessPhone {
    public CellPhone(int year, int hour) {
        super(year, hour);
    }

    @Override
    public void call(int outgoingNumber) {
        System.out.println("Calling " + outgoingNumber);
    }

    @Override
    public void ring(int incomingNumber) {
        System.out.println("Incoming call from " + incomingNumber);
    }
}
