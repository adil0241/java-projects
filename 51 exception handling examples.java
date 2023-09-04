class tryy
{
    public static void main(String[] args) 
    {
        int i=2;  //i=0
        int j=0;
        int obj[]=new int[5];
    
    try 
    {
        j=18/i;
        System.out.println(obj[5]);
    }
    catch(ArrayIndexOutOfBoundsException e)
    {
        System.out.println("arrays problem");
    }
    catch(ArithmeticException e)
    {
        System.out.println("int problem");
    }

    System.out.println(j);
}
    
}