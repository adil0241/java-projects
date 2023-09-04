class counter
{
    int count;
    public synchronized void increment()
    {
        count++;
    }
}
class o
{
    public static void main(String[] args) throws Exception
    {
        counter obj=new counter();

        Runnable obj1=()->
        {

        for(int i=1;i<=10;i++)
        
            obj.increment();
        
    };
        Runnable obj2=() ->
        {
           for(int i=1;i<=10;i++)
        
            obj.increment();
        
        };
        Thread t1=new Thread(obj1);
        Thread t2=new Thread(obj2);

        t1.start();
        Thread.sleep(10000);
        t2.start();
        
        
        System.out.println(obj.count);
    }
}