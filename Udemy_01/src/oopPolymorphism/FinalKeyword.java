package oopPolymorphism;

public class FinalKeyword {

    final int speedLimit = 90;

    final void run() {
        System.out.println("running.......");
    }

    public int squreFind(final int num) {
        // cant modify the num
        return num * num;
    }

}

/*
 * Final is used to be restrict the user
 * it can be variable, user or class
 * it says, stop value change, stop method overriding, stop inheritance
 */