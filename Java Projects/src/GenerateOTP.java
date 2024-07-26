import java.util.Random;
public class GenerateOTP {
    public static void main(String[] args){
        Random otp=new Random();
        int OTP=otp.nextInt(100000);
        System.out.println("Your OTP is "+OTP);
    }
}
