/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2.p1;

/**
 *
 * @author Dina
 */
public class Fraction {
     private double num, dem;
     public Fraction(double num, double dem)
     { this.num=num;
      this.dem= dem;
     }
     public void setNum(double num){
          this.num=num;
     }
       public void setDem(double dem){
          this.dem=dem;
     }
       
     public double getNum(){
          return this.num;
      }
     public  double getDem(){
          return this.dem;
      }
     public String getFractionSimplified(){
         String simplifiedFraction = null;
         int reminder1;
         int reminder2;
         double temp;
         if (this.num<this.dem)
         {temp= this.num;
         }
         else {
             temp=this.dem;
         }
         while(temp!=1)
         { reminder1=(int) (num%temp);
         reminder2=(int) (dem%temp);
           if(reminder1==0&&reminder2==0)
           { num=num/temp;
           dem=dem/temp;
           simplifiedFraction=num+"/"+dem;
           }
           temp--;
         }
         System.out.println("result= "+simplifiedFraction);
         return simplifiedFraction;
         
     }
     
}
