class q implements Runnable
{
    public void run()
    {
        for(int i=1;i<=10;i++)
        System.out.println("hiii");
        try {
            Thread.sleep(60);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
class t implements Runnable
{
    public void run()
    {
        for(int i=1;i<=10;i++)
        System.out.println("adillll");
        try {
            Thread.sleep(60);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
class y
{
    public static void main(String[] args) 
    {
        Runnable obj1=new q();
        Runnable obj2=new t();
        Thread t1=new Thread( obj1);
        Thread t2=new Thread( obj2);

        t1.start();
        t2.start();
    }
}


