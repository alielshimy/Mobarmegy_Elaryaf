package Section2;
import java.security.PublicKey;
import java.util.Scanner;

public class FractionClass {
    
    private int Numerator,Denumnator; 

    public int getDenumnator() {
        return Denumnator;
    }
    public int getNumerator() {
        return Numerator;
    }
    public void setDenumnator(int denumnator) {
        Denumnator = denumnator;
    }
    public void setNumerator(int numerator) {
        Numerator = numerator;
    }

    public String GetSimpelstForm()
    {
        String Result = "1/x";
        int SmallestNumber = (Denumnator<Numerator)? Denumnator:Numerator ;

        while(Numerator != 1)
        {
            int Reminder1 = Numerator%SmallestNumber;
            int Reminder2=  Denumnator%SmallestNumber;
            boolean in=false;

            if(Reminder1 ==0 && Reminder2 ==0)
            {
                Denumnator /=SmallestNumber;
                Numerator /=SmallestNumber;
                System.out.println(Numerator+"/"+Denumnator);
            }
            else if(Reminder1 !=0 || Reminder2 !=0)
            {
                for(int i=SmallestNumber-1;i>=1;i--)
                {
                    if(Numerator%i==0 && Denumnator%i==0)
                    {
                        Denumnator /=i;
                        Numerator /=i;
                        System.out.println(Numerator+"/"+Denumnator);
                        in=true;
                        break;
                    }
                    else{;}
                }
                
                if(!in) System.out.println(Numerator+"/"+Denumnator);
                break;
            }
        }


        return Result;
    }

}
