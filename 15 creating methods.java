class keyboard
{
    public void type()
    {
        System.out.println("do my home work");
    }
    public int sub(int n1,int n2)
    {
        return n1-n2;
    }
}   
class methood
{
    public static void main(String a[])
    {
        keyboard obj=new keyboard();
        obj.type();

        
        int result=obj.sub(75, 050);
        System.out.println(result);
    }
}