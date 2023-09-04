@Deprecated
class AAA
{
    public void show()
    {
        System.out.println("adil");
    }
}
class bcb extends AAA
{

    @Override
    public void show() 
    {
        System.out.println("bbb");
    }
        
       
}

class Ann
{
    public static void main(String[] args) 
    {
        bcb obj=new bcb();

        obj.show();
    }
}
    

