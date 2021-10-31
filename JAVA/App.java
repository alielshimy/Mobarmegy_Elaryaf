package Section2;
import java.util.Scanner;

public class App{

    public static void main(String[] args)
    {
        FractionClass Myclass = new FractionClass();
        Scanner scan = new Scanner(System.in);
        Myclass.setNumerator(scan.nextInt());
        Myclass.setDenumnator(scan.nextInt());
        Myclass.GetSimpelstForm();
        scan.close();
    }

}
