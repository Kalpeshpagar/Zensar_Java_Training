import java.util.HashMap;
import java.util.TreeSet;

public class Hashmap {
    public static void main(String[] args) {
        // TreeSet<Object> t = new TreeSet<>();
        // t.add(null); // NullPointerException: occur at run time
        // t.add(10);
        // t.add(20);
        // t.add(null); // NullPointerException: occur at run time
        // System.out.println(t);
        HashMap h1 = new HashMap();  //Note: Hashmap.java uses unchecked or unsafe operations.
        h1.put("name", "Kalpesh");
        h1.put("name", "Bharat");
        System.out.println(h1);
    }
}
