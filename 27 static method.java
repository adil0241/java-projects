class mobi
{
    String brand;
    int price;
    static String name;

    public void show()
    {
        System.out.println(brand+" : "+ price +" : "+name);
    }
    public static void show1(mobi obj)
    {
        System.out.println(obj.brand+" : "+obj.price +" : "+name);
    }

}
class deee
{
    public static void main(String[] args) 
    {
            
        mobi obj1=new mobi();
        obj1.brand="apple";
        obj1.price=5555;
        mobi.name="smartphone";
            
        mobi obj2=new mobi();
        obj2.brand="samsung";
        obj2.price=5556;
        mobi.name="smartphone";


        mobi.name="see";
    obj1.show();
    obj2.show();
    mobi.show1(obj1);
    }
    
}            