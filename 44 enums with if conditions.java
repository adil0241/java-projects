enum status
{
    run,fail,pending,success;
}
class dss
{
    public static void main(String[] args) 
    {
        status s= status.run;

        if(s==status.run)
        System.out.println("all good");

        else if(s== status.fail)
        System.out.println("try again");

        else if(s==status.pending)
        System.out.println("please wait");

        else
        System.out.println("done");

    }
}   

    