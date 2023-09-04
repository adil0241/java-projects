class wrapper
{
    public static void main(String[] args)
    {
        int num=77;
        Integer num1=num;  //auto boxing-primtive to object
        System.out.println(num1);

        int num2=num1;   //auto unboxing-object to primitve
        System.out.println(num2);

        String str="12";
        int num3=Integer.parseInt(str);
        System.out.println(num3*2);
    }
}