/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*Define a class called Counter whose objects count things. 
An object of this class records a count that is a nonnegative integer. 
Include methods to set the counter to 0, to increase the count by 1, 
and to decrease the count by 1. Be sure that no method allows the value of the 
counter to become negative. Include an accessor method that returns the current 
count value and a method that outputs the count to the screen. There should be 
no input method or other mutator methods. The only method that can set the 
counter is the one that sets it to zero. Also, include a toString method 
and an equals method. Write a program (or programs) to test all the methods
in your class definition.*/
package lab2q3;

/**
 *
 * @author Dina
 */
public class Lab2Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Counter _program = new Counter(); // Making an object _program of the class Counter 
        _program.SetZero();
        _program.Increment();
        _program.Decrment();
         _program.Increment();
         _program.Decrment();
        System.out.println (_program.ReturnCount());
        _program.Display();
    }
    
}
