package com.assignment4;

public class RationalNumbers {
    private int Numerator,Denomenator;

    public int getNumerator() {
        return Numerator;
    }

    public int getDenomenator() {
        return Denomenator;
    }

    public void setDenomenator(int denomenator) {
        this.Denomenator = denomenator;
        UpdateSign();
    }

    public void setNumerator(int numerator) {
        this.Numerator = numerator;
        UpdateSign();
    }
    public void setNemoAndDeno(int numerator,int denomenator)
    {
        this.Numerator = numerator;
        this.Denomenator = denomenator;
        UpdateSign();
    }
    RationalNumbers()
    {
        this.Denomenator = 1;
        this.Numerator = 0;
    }

    RationalNumbers(int numerator,int denomenator)
    {
        if(denomenator ==0){System.out.println("#ERRROR: can't divide by zero");return;}
        this.Denomenator = denomenator;
        this.Numerator = numerator;
        UpdateSign();
    }

    RationalNumbers(int WholeNumber)
    {
        this.Denomenator = 1;
        this.Numerator = WholeNumber;
    }
    
    public static RationalNumbers Add(RationalNumbers A,RationalNumbers B)
    {
        if(A.Numerator ==0 ){return B;}
        if(B.Numerator ==0 ){return A;}
        RationalNumbers C = new RationalNumbers();
        C.setNemoAndDeno(A.Numerator+B.Numerator,
                        A.Denomenator+B.Denomenator);
        return C;
    }    
    public static RationalNumbers Subtract(RationalNumbers A,RationalNumbers B)
    { if(A.Numerator ==0 ){return B;}
    if(B.Numerator ==0 ){return A;}
        RationalNumbers C = new RationalNumbers();
        C.setNemoAndDeno(A.Numerator-B.Numerator,
                        A.Denomenator-B.Denomenator);
        return C;
    }   
    public static RationalNumbers Multiply(RationalNumbers A,RationalNumbers B)
    {
        RationalNumbers C = new RationalNumbers();
        C.setNemoAndDeno(A.Numerator*B.Numerator,
                        A.Denomenator*B.Denomenator);
        return C;
    }
    public static RationalNumbers Divide(RationalNumbers A,RationalNumbers B)
    {
        RationalNumbers C = new RationalNumbers();
        C.setNemoAndDeno(A.Numerator*B.Denomenator,
                        A.Denomenator*B.Numerator);
        return C;
    }
    public static boolean equals(RationalNumbers A,RationalNumbers B)
    {
        return ( (A.Numerator*B.Denomenator) == (A.Denomenator*B.Numerator));
    }
    
    void UpdateSign()
    {
        if(Numerator<0 &&Denomenator>0 || (Numerator >0&&Denomenator>0))
        {
            return;
        }else // reverse sign of both of them
        {
            Numerator *=-1;
            Denomenator*=-1;
        }
    }

    @Override
    public String toString() {
        return "RationalNumbers [Denomenator=" + Denomenator + ", Numerator=" + Numerator + "]";
    }

/* part two
    public RationalNumbers Add(RationalNumbers A)
    {
        RationalNumbers C = new RationalNumbers();
        C.setNemoAndDeno(A.Numerator+this.Numerator,
                        A.Denomenator+this.Denomenator);
        return C;
    }    
    public RationalNumbers Subtract(RationalNumbers A)
    {
        RationalNumbers C = new RationalNumbers();
        C.setNemoAndDeno(A.Numerator-this.Numerator,
                        A.Denomenator-this.Denomenator);
        return C;
    }   
    public RationalNumbers Multiply(RationalNumbers A)
    {
        RationalNumbers C = new RationalNumbers();
        C.setNemoAndDeno(A.Numerator*this.Numerator,
                        A.Denomenator*this.Denomenator);
        return C;
    }
    public RationalNumbers Divide(RationalNumbers A)
    {
        RationalNumbers C = new RationalNumbers();
        C.setNemoAndDeno(A.Numerator*this.Denomenator,
                        A.Denomenator*this.Numerator);
        return C;
    }
    public boolean equals(RationalNumbers A)
    {
        return ( (A.Numerator*this.Denomenator) == (A.Denomenator*this.Numerator));
    }
    */

    //Part two alternate : this should be in a seperate class 
    public void Add(RationalNumbers A)
    {
        if(A.Numerator ==0){return;}
        this.setNemoAndDeno(A.Numerator+this.Numerator,
                        A.Denomenator+this.Denomenator);
    }    
    public void Subtract(RationalNumbers A)
    {
        if(A.Numerator ==0){return;}
        this.setNemoAndDeno(A.Numerator-this.Numerator,
                        A.Denomenator-this.Denomenator);
    }   
    public void Multiply(RationalNumbers A)
    {
        this.setNemoAndDeno(A.Numerator*this.Numerator,
                        A.Denomenator*this.Denomenator);
    }
    public void Divide(RationalNumbers A)
    {
        if(A.Denomenator ==0){System.out.println("#ERROR:CAn't divide by zero"); return;}
        this.setNemoAndDeno(A.Numerator*this.Denomenator,
                        A.Denomenator*this.Numerator);
    }
}
