import java.util.*;
//import java.util.stream.Stream;

class stream
{
    public static void main(String[] args) 
    {
        List<Integer> nums=Arrays.asList(1,2,3,4,5,6);

        //simple way to write below code

        int result=nums.stream()
            .filter(n->n%2==0)
            .map(n->n*2)
            .reduce(0,(c,e)->c+e);
            System.out.println(result);

        //Stream<Integer> s1=nums.stream();
        //Stream<Integer> s2=s1.filter(n->n%2==0);
        //Stream<Integer> s3=s2.map(n->n*2);
        //Integer s4=s3.reduce(0, (c,e)->c+e);
        //System.out.println(s4);
        
        
    }
}