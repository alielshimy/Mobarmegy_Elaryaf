/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sheet3.p2;

/**
 *
 * @author ziad
 */
public class mian {
    public static void main (String[] args)
    {
        VEHICLE V = new VEHICLE("Chevorlet ", 1500, " Ziad " );
        TRUCK T = new TRUCK(20, 2000, "Scania", 2500, "Ziad");
        System.out.println(V.toString());
        System.out.println(T.toString());
    }
   
}
