package OOPs;
import java.util.*;
public class CalculatorConstructor {
    public static void main (String args[])
    {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter the first number");
        int a=ob.nextInt();
        System.out.println("Enter the first number");
        int b=ob.nextInt();
        System.out.println("Press the number to perform the operation : ");
        System.out.println("Press 1 : ADDITION ");
        System.out.println("Press 2 : SUBTRACTION ");
        System.out.println("Press 3 : MULTIPLICATION ");
        System.out.println("Press 4 : DIVISION");
        int c=ob.nextInt();
        Calculation cal=new Calculation(a, b, c);
    }
}
class Calculation{
    public Calculation(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
        if (c==1){
            System.out.println("Addition = "+ (a+b));
        }
        else if (c==2){
            System.out.println("Sibtraction = "+ (a-b));
        }
        else if (c==3){
            System.out.println("Multiplication = "+ (a*b));
        }
        else if (c==4){
            System.out.println("Division = "+ (a/b));
        }
        else{
            System.out.println("Invalid Operation");
        }
    }

    int a,b,c;

}
