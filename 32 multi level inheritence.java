class calciiii
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
class advcalcii extends calciiii
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
class scicalci extends advcalcii
{
    public double pow(int n1,int n2)
    {
        return Math.pow(n1, n2);
    }
}
class singleinheritt
{
    public static void main(String[] args) 
    {
        scicalci obj=new scicalci();
        int r1=obj.add(5,3);
        int r2=obj.sub(5,3);
        int r3=obj.mul(5,3);
        int r4=obj.div(5,3);
        double r5=obj.pow(5,3);
        System.out.println("add-"+r1+" sub-"+r2+" mul-"+r3+" div-"+r4+" pow-"+r5);

    }
}