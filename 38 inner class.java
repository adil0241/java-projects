class inn
{
    public void show()
    {
        System.out.println("in show");
    }
    class bb
    {
        public void config()
        {
            System.out.println("to config");
        }
    }
}
class dooo
{
    public static void main(String[] args) 
    {
        inn obj=new inn();
        obj.show();

        
        inn.bb obj1=obj.new bb();
        obj1.config();
    }
}