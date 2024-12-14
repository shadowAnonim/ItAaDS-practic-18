import java.util.Scanner;

public class ThrowsDemo {
    public void getKey() {
        boolean valueFound = false;
        do
        {
            Scanner myScanner = new Scanner(System.in);
            String key = myScanner.next();
            try
            {
                printDetails(key);
                valueFound = true;
            }
            catch (Exception e)
            {
                System.out.println("Wrong key value");
            }
        } while (!valueFound);
    }
    public void printDetails(String key) throws Exception {
        try { String message = getDetails(key);
            System.out.println( message );
        }catch (Exception e){
            throw e;
        }
    }
    private String getDetails(String key) throws Exception {
        if (key.isEmpty())
            throw new Exception("Key set to empty string");
        return "data for " + key; }
}