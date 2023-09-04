class calculator
{
    public int add(int n1,int n2)
    {
    int r=n1+n2;
    return r;
    }
}
class example
{
    public static void main(String a[])
    {
    calculator caci=new calculator();
    int result=caci.add(40, 050);
    System.out.println(result);
    }
}