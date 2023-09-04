class w extends Thread
{
    public void run()
    {
        for(int i=1;i<=10;i++)
        System.out.println("hi");

        //creating time scheduler using sleep()

        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
        
            e.printStackTrace();
        }
    }
}
class v extends Thread
{
    public void  run()
    {
        for(int i=1;i<=10;i++)
        System.out.println("Adil");
        try{
            Thread.sleep(10);
        }
        catch(InterruptedException e)
        {
            e.printStackTrace();
        }
        
    }
}
class u
{
    public static void main(String a[])
    {
        w obj=new w();
        v obj1=new v();

        obj.start();
        obj1.start();
    }
}