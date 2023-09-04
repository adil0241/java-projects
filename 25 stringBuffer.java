class stringBuffer
{
    public static void main(String[] args) 
    {
        StringBuffer name=new StringBuffer("adil");
        name.append(" shaik");
        name.delete(0, 04);
        
        System.out.println(name);
        // to convert into normal string
        String str=name.toString();
        System.out.println(str);

    }
}