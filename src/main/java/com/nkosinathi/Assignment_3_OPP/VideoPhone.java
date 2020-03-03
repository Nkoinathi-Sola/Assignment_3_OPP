package com.nkosinathi.Assignment_3_OPP;
/***
 * And finally, a cool video phone:
 * ***/
public class VideoPhone extends AbstractPhone {

    public VideoPhone(int year) {
        super(year);
    }
    @Override
    public void call(int outgoingNumber) {
        System.out.println("Connecting video call to " + outgoingNumber);
    }
    @Override
    public void ring(int incomingNumber) {
        System.out.println("Incoming video call from " + incomingNumber);
    }
}
