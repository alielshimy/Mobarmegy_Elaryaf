/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
Create a class called Vehicle that has the manufacturer’s name (type String), 
number of cylinders in the engine (type int), and owner (type String). 
Then, create a class called Truck that is a child of Vehicle and has the following 
additional properties: the load capacity in tons (type double) and towing capacity in pound (type int)
. Be sure your class has a constructor a, function to set values of class variables, and another one to get their values.
Write a main function to test all functions in Vehicle and Truck classes.
*/
package sheet3.p2;


/**
 *
 * @author ziad
 */
public class VEHICLE {
    private String Manfacture_name;
    private int number_of_cylinders;
    private String owner_name ;
    public VEHICLE( String Manfacture_name,int number_of_cylinders , String owner_name )
    {
        this.Manfacture_name = Manfacture_name ;
        this.number_of_cylinders = number_of_cylinders ;
        this.owner_name = owner_name ;
    }

    public String getManfacture_name() {
        return Manfacture_name;
    }

    public int getNumber_of_cylinders() {
        return number_of_cylinders;
    }

    public String getOwner_name() {
        return owner_name;
    }

    public void setManfacture_name(String Manfacture_name) {
        this.Manfacture_name = Manfacture_name;
    }

    public void setNumber_of_cylinders(int number_of_cylinders) {
        this.number_of_cylinders = number_of_cylinders;
    }

    public void setOwner_name(String owner_name) {
        this.owner_name = owner_name;
    }
    @Override
    public String toString()
    {
        return("Manfacture Name :"+getManfacture_name()+"\tNumber of Cylinders equals: "+getNumber_of_cylinders()+"\tOwner name "+getOwner_name());
    }
    
    
}
/*
the load capacity in tons (type double) and towing capacity in pound (type int)
. Be sure your class has a constructor a, function to set values of class variables, and another one to get their values.
*/
 class TRUCK extends VEHICLE {
    private double load_capacity ;
    private int towing_capacity ;
    public TRUCK(double load_capacity ,int towing_capacity,String Manfacture_name,int number_of_cylinders , String owner_name)
    {
        super(Manfacture_name, number_of_cylinders ,  owner_name);
        this.load_capacity = load_capacity ;
        this.towing_capacity = towing_capacity ;
    }

    public void setLoad_capacity(double load_capacity) {
        this.load_capacity = load_capacity;
    }

    public void setTowing_capacity(int towing_capacity) {
        this.towing_capacity = towing_capacity;
    }

    public double getLoad_capacity() {
        return load_capacity;
    }

    public int getTowing_capacity() {
        return towing_capacity;
    }
    @Override
    public String toString()
    {
        return("Manfacture Name :"+super.getManfacture_name()+"\tNumber of Cylinders equals: "+super.getNumber_of_cylinders()+"\tOwner name "+super.getOwner_name()+"\tLoad Capacity equals :"+getLoad_capacity()+"\tTowing capacity is :"+getTowing_capacity());
    }
    
}

