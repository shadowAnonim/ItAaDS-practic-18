import java.util.Scanner;

public class Exception2 {
    public void exceptionDemo() {
        try
        {
            Scanner myScanner = new Scanner(System.in);
            System.out.print( "Enter an integer ");
            String intString = myScanner.next();
            int i = Integer.parseInt(intString);
            System.out.println( 2/i );
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Method executed");
        }
    }
}
