import java.util.SortedMap;
import java.util.TreeMap;

public class Sorted_Map {
    public static void main(String[] args) {
        SortedMap<Integer,String> s1 = new TreeMap<Integer,String>();
            s1.put(1,"Kalpesh");
            s1.put(5,"Ram");
            s1.put(3,"Charan");
            s1.put(10,"Gopi");
            System.out.println(s1);
        System.out.println(s1.firstEntry());
        System.out.println(s1.lastEntry());
        System.out.println(s1.firstKey());
        System.out.println(s1.toString());
    }
    
}
