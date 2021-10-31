/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;
import java.util.Scanner ; 

/**
 *
 * @author ziad
 */
public class p3 {
    
    public static void main(String[]args)
    {
        class math {
        double fatorial(double num){
            double value=1;
            for(double i=num;i>0;i--){
                    value*=i;
                }
            return (value);
            }
        }
        boolean Continue = true ; 
        int close ;
        math m = new math();
        double X ;
        double Ans;
        Scanner scan = new Scanner(System.in);
        while (Continue)
        {
           Ans=0;
            System.out.println("PLEASE ENTER THE VALUE OF X");
            X = scan.nextInt();
            for(double i=0 ; i<10 ;i++)
            {
                Ans= Ans + (Math.pow(i, X))/(m.fatorial(i));
            }
            System.out.println("Range 10 Answer is :"+Ans);
            for(double i=0 ; i<50 ;i++)
            {
                Ans= Ans + (Math.pow(i, X))/(m.fatorial(i));
            }
            System.out.println("Range 50 Answer is :"+Ans);
            for(double i=0 ; i<100 ;i++)
            {
                Ans= Ans + (Math.pow(i, X))/(m.fatorial(i));
            }
            System.out.println("Range 100 Answer is :"+Ans);
            System.out.println("press 1 to close app");
            close = scan.nextInt();
            if(close==1)
            {Continue = false;}
        }
    }
}
