interface a 
{
    void show();
}
class B implements a
{
    public void show()
    {
        System.out.println("show something");
    }
}
class ccc
{
    public static void main(String[] args) 
    {
        a obj=new B();
        obj.show();
    }
}