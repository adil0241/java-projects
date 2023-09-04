import java.util.*;

// want to get based on last digit og given numbers
class comparee
{
    public static void main(String[] args) 
    {
        Comparator<Integer> com=new Comparator<Integer>() 
        {
            public int compare(Integer i,Integer j)
            {
                if( i%10 > j%10)
                return 1;
                else
                return -1;
            }
        };

        
    
        List<Integer> nums=new ArrayList<>();
            nums.add(45);
            nums.add(46);
            nums.add(88);
            nums.add(41);

            Collections.sort(nums,com);
            System.out.println(nums);
    }
}