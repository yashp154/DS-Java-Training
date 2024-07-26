import java.util.*;
public class BMIcalculator {
    public static void main(String[] args){
        Scanner ob =new Scanner(System.in);
        System.out.println("Enter your height in meters");
        float hm=ob.nextFloat();
        System.out.println("Enter your weight in kilograms");
        float wk=ob.nextFloat();
        float bmi=wk/(hm*hm);
        System.out.println("Your BMI : "+bmi);
    }

}
