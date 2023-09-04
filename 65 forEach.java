
import java.util.*;

class forreach
{
    public static void main(String[] args) 
    {
        List<Integer> nums=Arrays.asList(4,5,6,6,8);
        nums.forEach(n->System.out.println(n));

        

        //for(int n:nums)
        //System.out.println(n);

        //for(int i=0;i<nums.size();i++)
        //{
        //    System.out.println(i);
        //}
    }
}