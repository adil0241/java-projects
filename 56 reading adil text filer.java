import java.io.BufferedReader;
import java.io.FileReader;


class cmmm
{
    public static void main(String[] args) throws Exception
    {
    try
    {
        BufferedReader obj= new BufferedReader(new FileReader("56 adil.txt"));
        System.out.println(obj.readLine());
        obj.close();
    }
    catch(Exception e)
    {
        System.out.println("something went wrong");
    }
}
}
