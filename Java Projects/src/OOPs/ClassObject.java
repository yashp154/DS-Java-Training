package OOPs;
import java.util.Scanner;

public class ClassObject {
    public static void main(String []args)
    {
        Scanner ob=new Scanner(System.in);
        Student student=new Student();

        System.out.println("Enter yor name");
        student.StudentName = ob.nextLine();
        System.out.println("Enter yor technology");
        student.StudentEnrolledTechnology = ob.nextLine();

        System.out.println("Your name is "+student.StudentName+" and your technology is "+student.StudentEnrolledTechnology);




    }
}
class Trainer{
    String TrainerName;
    String TrainerTechnology;
    

}
class Student{
    String StudentName;
    String StudentEnrolledTechnology;

}