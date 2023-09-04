//import java.util.Collection;
import java.util.Hashtable;
import java.util.Map;

class MApp
{
    public static void main(String[] args) 
    {
        Map<String,Integer> stu=new Hashtable<String,Integer>();
        stu.put("Adil", 55);
        stu.put("bot", 99);
        stu.put("sabi",75);
        stu.put("Adil2", 25);
        for(String s:stu.keySet())
        System.out.println(s +" : " + stu.get(s));
        
    }
}