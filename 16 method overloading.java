class calci
{
    public int add(int n1,int n2,int n3)
    {
        return n1+n2+n3;
    }
    public int add(int n1,int n2)
    {
        return n1+n2;
    }
    public void add()
    {
        System.out.println("hiii");
    }
}
class other
{
    public static void main(String a[])
    {
        calci obj=new calci();
        obj.add();
        
        
        
    }
}
