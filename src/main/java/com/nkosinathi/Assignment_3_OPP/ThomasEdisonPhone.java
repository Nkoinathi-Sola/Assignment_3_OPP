package com.nkosinathi.Assignment_3_OPP;
/***
 * Now we will describe several kinds of phones. One of the first phones:
 * **/
public class ThomasEdisonPhone extends AbstractPhone {

    public ThomasEdisonPhone(int year) {
        super(year);
    }
    @Override
    public void call(int outgoingNumber) {
        System.out.println("Crank the handle");
        System.out.println("What number would you like to connect to?");
    }

    @Override
    public void ring(int incomingNumber) {
        System.out.println("The phone is ringing");
    }
}