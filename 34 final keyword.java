// final variable
class ab
{
    public static void main(String[] args) 
    {
        final int num=22;
        System.out.println(num);
    }
}

//final method

class abb
{
    public final void show()
    {
        System.out.println("in show A");
    }
}
class abc extends abb
//error
{
   // public void show()
    {
        System.out.println("in show b");
    }
}
class abdd
{
    public static void main(String[] args) 
    {
        abc obj=new abc();
        obj.show();
    }
}