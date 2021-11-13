package com.assignment4;

/**
 * Hello world!
 */
public final class App {

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */

     //MCQ answers *******
     //Inheritance 
     // B,C
     // A
     //
     //c) "The default constructor of A is invoked""The default constructor of B is invoked"
    public static void main(String[] args) {

        RationalNumbers Rnumber = new RationalNumbers(3,4);
        RationalNumbers Rnumber2 = new RationalNumbers(1,2);
        Rnumber.Add(Rnumber2);
        RationalNumbers Rnumber3 = RationalNumbers.Subtract(Rnumber,Rnumber2);
        System.out.println(Rnumber3.toString());

        Rnumber3.Multiply(Rnumber3);
        System.out.println(Rnumber3.toString());

    }
}
