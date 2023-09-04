class hum
{
    private int age;
    private String name;
    public hum()
    {
        age=10;
        name="adil";

    }
    public void setage(int age)
    {
        this.age=age;

    }
    public int getage()
    {
        return age;

    }
    public void setname(String name)
    {
        this.name=name;

    }
    public String getname()
    {
        return name;
    }
}
class eeexx
{
    public static void main(String[] args) 
    {
    hum obj=new hum();
    
    
    
    System.out.println(obj.getname()+" : "+obj.getage());
    
   
    }

}