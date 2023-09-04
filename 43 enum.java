enum status
{
    run,fail,pending,success;
}
class eee
{
    public static void main(String[] args) 
    {

    //print all using for lopp,so first create an arry
        status [] ss= status.values();
        
        for(status s:ss)
        {
        System.out.println(s);
        }
    }
}