import java.util.ArrayList;
//import java.util.collection;
import java.util.List;

class arraylistt
{
    public static void main(String[] args) 
    {
        List<Integer> nums=new ArrayList<Integer>();
        nums.add(8);
        nums.add(1);
        nums.add(6);
        nums.add(2);

        for(int n:nums)
        {
            System.out.println(n);
        }
        System.out.println(nums);

        // to get element using index
        System.out.println(nums.get(2));
        //to know index using element
        System.out.println(nums.indexOf(8));
        

    }
}