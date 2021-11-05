/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sheet3;

/**
 *
 * @author ziad
 */
public class Sheet3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        TEMP t1 = new TEMP();
        TEMP t2 = new TEMP(32 ,'F');
        TEMP t3 = new TEMP(-40);
        TEMP t4 = new TEMP(-40,'F');
        TEMP t5 = new TEMP(100);
        TEMP t6 = new TEMP(212,'F');
        System.out.println(t1.toString());
        System.out.println(t2.toString());
        System.out.println(t3.toString());
        System.out.println(t4.toString());
        System.out.println(t5.toString());
        System.out.println(t6.toString());
        if(t1.isLess(t1.getTempC(), t2.getTempF()))
        {System.out.println("t1 is less than t2");}
        if(t1.isGreater(t5.getTempC(), t2.getTempF()))
        {System.out.println("t5 is Grater than t2");}
        if(t1.equals(t3.getTempC(), t4.getTempF()))
        {System.out.println("t3 is  equal to  t2");}
        if(t1.equals(t3.getTempC(), t1.getTempF()))
        {System.out.println("The program isn't working properly");}
        
    }
    
}
