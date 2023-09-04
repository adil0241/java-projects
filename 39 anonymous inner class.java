class anon
{
    public void show()
    {
        System.out.println("in show");
    }
}
class dem
{
    public static void main(String[] args)
    {
       anon obj=new anon() 
       {
        public void show()
        {
            System.out.println("in new show");
        }
       };
       obj.show();
    }
}