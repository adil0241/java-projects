// it prints 0 when we divide by 20
// to overcome this we crete own exception and used thorw keyword
class adilException extends Exception
{
    public adilException(String string)
    {
        super(string);
    }
}
class man{
    public static void main(String[] args) 
    {
        int i=20;
        int j=0;

        try
        {
            j=18/i;
            if(j==0)
                throw new adilException("i dont want to print zero");
        }
        catch(adilException e)
        {
            j=18/1;
            System.out.println("check again" );
        }
        catch(Exception e)
        {
            System.out.println("something went wrong");
        }
        System.out.println(j);
        System.out.println("Bye");
    }
}