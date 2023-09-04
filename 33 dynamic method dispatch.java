class aaaa
{
    public void show()
    {
        System.out.println("in aaaa show");
    }
}

class bbbb extends aaaa
{
    public void show()
    {
        System.out.println("in bbbb show");
    }
}

class cccc extends bbbb
{
    public void show()
    {
        System.out.println("in cccc show");
    }
}
class use
{
    public static void main(String[] args) 
    {
        aaaa obj=new aaaa();
        obj.show();

        obj=new bbbb();
        obj.show();

        obj=new cccc();
        obj.show();
        
    }
}