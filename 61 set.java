//import java.util.HashSet;
//import java.util.Set;
import java.util.*;
class sett
{
    public static void main(String[] args) 
    {
        //to get sorted use Treeset

        Set<Integer> nums=new HashSet<Integer>();


        nums.add(2);
        nums.add(8);
        nums.add(8);
        nums.add(3);
        nums.add(1);
    
        

        for(int n:nums)
        {
            System.out.println(n);
        }
        System.out.println(nums);

        
    }
}