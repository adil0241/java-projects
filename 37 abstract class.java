abstract class car
{
    public abstract void drive();
    {

    }
    public void playmusic()
    {
        System.out.println("play it");
    }
}

//concrete class--generally we cannot create object for abstract class so we use another class i.e is concrete class
class wagnor extends car
{
    public void drive()
    {
        System.out.println("just drive");
    }
}
class doo
{
    public static void main(String[] args) 
    {
        new wagnor().playmusic();
        new wagnor().drive();
    }
}