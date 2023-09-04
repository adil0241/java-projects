

class human
{
    private int age;
    private String name;

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
class ee
{
    public static void main(String[] args) 
    {
    human obj=new human();
    human obj1=new human();
    obj1.setage(12);
    obj1.setname("shaik");
    obj.setage(10);
    obj.setname("adil");
    System.out.println(obj.getname()+" : "+obj.getage());
    System.out.println(obj1.getname()+" : "+obj1.getage());
    }

}