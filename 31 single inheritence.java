class calciii
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
class advcalcii extends calciii
{
    public int mul(int n1,int n2)
    {
        return n1*n2;
    }
    public int div(int n1,int n2)
    {
        return n1/n2;
    }
}
class singleinherit
{
    public static void main(String[] args) 
    {
        advcalcii obj=new advcalcii();
        int r1=obj.add(5,3);
        int r2=obj.sub(5,3);
        int r3=obj.mul(5,3);
        int r4=obj.div(5,3);
        System.out.println("add-"+r1+" sub-"+r2+" mul-"+r3+" div-"+r4);

    }
}