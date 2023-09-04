import java.util.*;
import java.io.IOException;
class scannerr
{
    public static void main(String[] args) throws IOException
    {
        System.out.println("enter a number:");

        // In end we have to close resource,so we used try with resources
           try (Scanner obj = new Scanner(System.in)) {
            int bb=obj.nextInt();
            System.out.println(bb);
        }
        

    }
  
}