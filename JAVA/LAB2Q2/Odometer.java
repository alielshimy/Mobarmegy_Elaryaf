/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package section.pkg2;

/**
 *
 * @author Dina
 */
public class Odometer {
    private double miles, eff,gallons=0,LastGallons=0;
    
    public void setMiles(double miles){
          this.miles=miles;
     }
     public void rsetMiles(){
          this.LastGallons=this.gallons;
          this.miles=0;
     }
     public void updateMiles(double miles){
          this.miles+=miles;
     }
     
       public void setEff(double eff){
          this.eff=eff;
     }
        public double getMiles(){
          return this.miles;
      }
     public  double getEff(){
          return this.eff;
      }
     
      public void addTrip(double _miles)
      {
         gallons +=_miles*eff;
         this.updateMiles(_miles);
      }
      
      public double updateGallons(double _miles)
      {
         return LastGallons-gallons;
      }
      
      
    
    
}
