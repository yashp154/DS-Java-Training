import java.util.*;
public class CurrencyConvertor {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.println("Currency Convertor");
        System.out.println("Press 1 : USD to INR");
        System.out.println("Press 2 : INR to USD");
        System.out.println("Press 3 : To Exit");
        int option = ob.nextInt();
        switch (option) {
            case 1: {
               usdTOinr();
                break;
            }
            case 2: {
                inrTOusd();
              break;
            }
            case 3: {
                System.out.println("Thank You !! For using the service.");
                break;
            }
            default: {
                System.out.println("!!!! Invalid Input !!!!!");
            }
        }
    }
    private static void usdTOinr()
    {
        Scanner ob=new Scanner(System.in);
        float INR = 83.73f;
        System.out.println("Enter the USD Amount :");
        float usd = ob.nextFloat();
        usd = usd * INR;
        System.out.println("The Amount in INR :  Rs " + usd);
    }
    private static void inrTOusd()
    {
        Scanner ob=new Scanner(System.in);
        float USD =0.012f;
        System.out.println("Enter the INR Amount :");
        float inr = ob.nextFloat();
        inr = inr * USD;
        System.out.println("The Amount in USD :  $" + inr);
    }
}


