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
/*
    degreesC = 5 (degreesF - 32) / 9
    degreesF = (9(degreesC) / 5) + 32;
*/
public class TEMP {
    private float Value;
    private char Scale ;
    public TEMP ()
    {
        this.Value = 0;
        this.Scale = 'C';
    }
    public TEMP(float Value)
    {
        this.Value = Value;
        this.Scale = 'C';
    }
    public TEMP(float Value, char Scale)
    {
      this.Value = Value;
      this.Scale = Scale;  
    }
    public float getTempC()
    {
        float Temp ;
        if(this.Scale=='C')
        {Temp=this.Value;}
        else{Temp = (5*(this.Value-32))/9;}
        return(Temp);
    }
    public float getTempF()
    {
        float Temp ;
        if(this.Scale=='F')
        {Temp=this.Value ;}
        else{Temp = (9*(this.Value) / 5) + 32;}
        return (Temp);
    }

    public void setValue(float Value) {
        this.Value = Value;
    }

    public void setScale(char Scale) {
        this.Scale = Scale;
    }
    public void setValue_Scale(float Value ,char Scale )
    {
        this.Value = Value;
        this.Scale = Scale;
    }
    public boolean equals(float temp1,float temp2)
    {
        return(temp1 == temp2);
    }
    public boolean isGreater(float temp1,float temp2)
    {
        return(temp1>temp2);
    }
    public boolean isLess(float temp1,float temp2)
    {
        return(temp1<temp2);
    }
    @Override
    public String  toString()
    {
        return("The temperature = "+this.Value+" in "+this.Scale);
    }
    
}
