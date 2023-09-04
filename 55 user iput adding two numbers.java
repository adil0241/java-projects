import java.util.*;
import java.io.IOException;
class scannnerr
{
    public static void main(String[] args) throws IOException
    {
        System.out.println("enter a first number:");
        System.out.println("enter second number:");

        // In end we have to close resource,so we used try with resources
           try (Scanner obj = new Scanner(System.in)) 
           {
            int bb=obj.nextInt();
           
           
           try (Scanner obj1= new Scanner(System.in))
           {
            int cc=obj1.nextInt();
            
            int total= bb+cc;
            System.out.println(total);
           }
        }
        

    }
  
}