class mobiles
{
    String brand;
    int price;
    static String name;

    public void show()
    {
        System.out.println(brand+" : "+ price +" : "+name);
    }
}    
class dee
{
    public static void main(String[] args) 
    {
            
        mobiles obj1=new mobiles();
        obj1.brand="apple";
        obj1.price=5555;
        mobiles.name="smartphone";
            
        mobiles obj2=new mobiles();
        obj2.brand="samsung";
        obj2.price=5556;
        mobiles.name="smartphone";


        mobiles.name="one plus";
    obj1.show();
    obj2.show();
    }
    
}            


