package com.nkosinathi.Assignment_3_OPP;
/***
 * And finally, we have the smartphone class, which, unlike classic cell phones,
 * has a full-fledged operating system. You can expand your smartphone's functionality
 * by adding new programs that can run on its operating system. In code, the class can be described as follows:
 * ***/
public class Smartphone extends CellPhone {

    private String operationSystem;

    public Smartphone(int year, int hour, String operationSystem) {
        super(year, hour);
        this.operationSystem = operationSystem;
    }
    public void install(String program) {
        System.out.println("Installing " + program + " for " + operationSystem);
    }

}

/***
 * As you can see, we created quite a bit of new code to describe the Smartphone class,
 * but we got a new class with new functionality. This principle of OOP makes it possible to
 * significantly reduce the amount of Java code required, thus making life easier for the programmer.
 * ***/
