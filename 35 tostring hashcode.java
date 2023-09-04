class laptop
{
    String model;
    int price;

    public String toString()
    {
        return model+" : "+price;
    }

    //syntax for equal to string hashcode is
    // public boolean equals(object obj)
    public boolean equals(laptop that)
    {
        return this.model.equals(that.model)&& this.price==that.price;
    }

    
}
class sss
{
    public static void main(String[] args) 
    {
        laptop obj1=new laptop();
        obj1.model="dell";
        obj1.price=1000;
        laptop obj2=new laptop();
        obj2.model="dell";
        obj2.price=1000;
        boolean result=obj1.equals(obj2);
        System.out.println(result);
        
    }
}