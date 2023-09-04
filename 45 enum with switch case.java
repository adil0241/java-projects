enum status
{
    run,fail,pending,success;
}
class enumm
{
    public static void main(String[] args) 
    {
        status s=status.pending;

        switch(s)
        {
            case run:
            System.out.println("all good");
            break;

            case fail:
            System.out.println("try again");
            break;

            case pending:
            System.out.println("please wait");
            break;

            default:
            System.out.println("all good");
            break;
        }
    }
}