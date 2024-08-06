package OOPs;

public class ExceptionHandling {
    public static void main(String args[])
    {
        //try() catch() exceptional handling technique on divide by zero exception
        try {
            System.out.println(100 / 0); // here we write the code from which we get the exception
        }catch(Exception exception)// here we make a object named exception
        {
            System.out.println(exception);// now we print the exception and therefore the exception is handled
        }
        // try() catch() exceptional handling on null string length
        String name =null;
        try{
            System.out.println(name.length());
        }
        catch(Exception nam)
        {
            System.out.println(nam);
        }
        //input type or format error
        String fullname="Yash";
        try{
            int z=Integer.parseInt(fullname);
        }
        catch(Exception it) {
            System.out.println(it);
        }
        //out of bounds exception
        int arr[] = {1,2,3,4};
        try{
            System.out.println(arr[6]);
        }
        catch(Exception ob)
        {
            System.out.println(ob);
        }
        finally{
            System.out.println("This is Finally Code");
        }
    }
}
