import java.util.*;

class iterat
{
    public static void main(String[] args) 
    {
        Collection<Integer> nums=new TreeSet<Integer>();
        nums.add(5);
        nums.add(2);
        nums.add(6);
        nums.add(8);

        Iterator<Integer> value=nums.iterator();
        while(value.hasNext())
        System.out.println(value.next());
    }
}