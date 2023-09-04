import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class mnn
{
    public static void main(String[] args) throws IOException
    {
        System.out.println("enter a number");
        InputStreamReader in=new InputStreamReader(System.in);
        BufferedReader br= new BufferedReader(in);
        int num=Integer.parseInt(br.readLine());
        System.out.println(num);
    }
}