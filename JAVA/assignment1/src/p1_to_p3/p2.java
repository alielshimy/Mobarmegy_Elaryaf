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
public class p2 {
    public static void main (String[]args)
    {
        Scanner INPUT = new Scanner(System.in);
        System.out.println("PLEASE ENTER A WORD ");
        String str = INPUT.next();
        System.out.println("the word in uppercase ");
        System.out.println(str.toUpperCase());
        System.out.println("the word in lower case ");
        System.out.println(str.toLowerCase());
    }
    
    
}
