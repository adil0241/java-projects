interface AA

{
    int add(int n1,int n2);
}
interface BB 
{
    int sub(int n1, int n2);
}

class cc implements AA,BB
{
    public int add(int n1,int n2)
    {
    return n1+n2;
    }
    public int sub(int n1,int n2)
    {
        return n1-n2;
    }
       
}
class DDD
{
    public static void main(String[] args) 
    {
        AA obj=new cc();
        int result=obj.add(44, 055);
        System.out.println(result);

        BB obj1=new cc();
        int result1=obj1.sub(44, 020);
        System.out.println(result1);
       
        

    }
}
