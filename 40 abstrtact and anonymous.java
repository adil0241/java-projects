abstract class egggg
{
    public abstract int add(int n1,int n2);
}
class demmm
{
    public static void main(String[] args) 
    {
        egggg obj=new egggg() 
        {
            public int add(int n1,int n2)
            {
                return n1+n2;
            }
        };
        int result=obj.add(44, 022);
        System.out.println(result);
    }
}