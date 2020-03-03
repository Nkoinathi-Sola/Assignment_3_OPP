package com.nkosinathi.Assignment_3_OPP;
/***
 * We'll create objects in the main() method and test the callAnotherUser() method:
 * ***/
public class Main {
    public static void main(String args[]){
        AbstractPhone firstPhone = new ThomasEdisonPhone(1879);
        AbstractPhone phone = new Phone(1984);
        AbstractPhone videoPhone=new VideoPhone(2018);
        User user = new User("Jason");
        user.callAnotherUser(224466, firstPhone);
        // Crank the handle
        // What number would you like to connect to?

        user.callAnotherUser(224466, phone);
        // Calling 224466

        user.callAnotherUser(224466, videoPhone);
        // Connecting video call to 224466

    }
}
