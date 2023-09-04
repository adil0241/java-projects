enum laptops
{
    dell(20000),macbook(500000),xps(425522);

    private int price;

    private laptops(int price)
    {
        this.price=price;
    }

    public int getPrice() 
    {
        return price;
    }

    public void setPrice(int price) 
    {
        this.price = price;
    }
    

}
class prr
{
    public static void main(String[] args) 
    {
        laptops [] laps=laptops.values();
        for(laptops lap:laps)
        System.out.println(lap +" = " + lap.getPrice());
    }
}