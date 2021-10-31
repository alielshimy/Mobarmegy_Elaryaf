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
public class Counter { // Class defenition 
    private int CurrentCount; // Counter variable that will be changed within the code 
    public void SetZero()   // Setting the counter to zero 
    {
        this.CurrentCount = 0;
    }
    public void Increment() // Increamintng the count by one 
    {
        this.CurrentCount++;
    }
    public void Decrment() // Deacremnting the count by one 
    {
        if (CurrentCount==0) // checing before decreaminting so count value doesn't go under zero 
        {
           System.out.println("Can't go under zero");
        }
        else
        {
            this.CurrentCount--;
        }
    }
    public int ReturnCount() // Returning the current count 
    {
        return this.CurrentCount; 
    }
      public void Display()  // Displaying the current count 
    {
        System.out.println(this.CurrentCount); 
    }
    
}
