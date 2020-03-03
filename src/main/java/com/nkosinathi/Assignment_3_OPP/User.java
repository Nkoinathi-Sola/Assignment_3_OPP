package com.nkosinathi.Assignment_3_OPP;
/***
 * Polymorphism
 *
 * Despite differences in the appearance and design of various kinds of phones, we can identify some common behavior:
 * they all can receive and make calls and all have a fairly clear and simple set of controls. In terms of programming,
 * the principle of abstraction (which we are already familiar with) lets us say that phone objects have a common interface.
 * That's why people can easily use different models of phones that have the same controls
 * (mechanical buttons or a touchscreen), without delving into the technical details of the device.
 * Thus, you use a cell phone constantly and you can easily make a call from your friend's landline.
 *
 * The principle of OOP that says that a the program can use objects with a common interface without any
 * information about the object's internal structure is called polymorphism.
 *
 * Let's imagine that we need our program to describe a user who can use any phone to call another user. Here's how we can do it:
 * ***/
public class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public void callAnotherUser(int number, AbstractPhone phone){
    // And here's polymorphism: using the AbstractPhone type in the code!
        phone.call(number);
    }
}
