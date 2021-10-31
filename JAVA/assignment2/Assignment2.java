/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;
import java.util.Scanner ;
       
 class Counter{
private int count;
 public Counter (){
    this.count =0;
}
public void ResetCount()
{
    this.count =0;
    
}
public void Increment ()
{
    this.count +=1;
    if(this.count < 0)
        this.count = 0;
        
}
public void Decrement()
{
    this.count -=1;
    if(this.count < 0)
         this.count = 0;
}
public int GetCount()
{
 return(this.count);   
}
}

/**
 *
 * @author ziad
 */
public class Assignment2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Counter mycounter = new Counter();
        mycounter.Increment();
       System.out.println(mycounter.GetCount());
       mycounter.Decrement();
       System.out.println(mycounter.GetCount());
       mycounter.Increment();
       mycounter.Increment();
       mycounter.Increment();
       System.out.println(mycounter.GetCount());
       mycounter.ResetCount();
       System.out.println(mycounter.GetCount());

       
        
    }
    
}
