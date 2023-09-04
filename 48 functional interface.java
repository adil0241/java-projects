@FunctionalInterface
interface me
{
    void show();
}
//class catst implements AAAA
//{
//  public void show()
//    {
//        System.out.println("in ca show");
//    }
//}

class did 
{
    public static void main(String[] args) 
    {
        // anonymous inner class
        me obj=new me() 
        {
            public void show()
            {
                System.out.println("in showw");
            }
        };
        obj.show();
    }
}