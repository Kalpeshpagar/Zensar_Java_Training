import java.util.LinkedHashMap;

public class Linked_HashMap {
    public static void main(String[] args) {
        LinkedHashMap l1 = new LinkedHashMap<>();
        l1.put("Name ", "Kalpesh");
        l1.put("ID ", "101");
        l1.put("ID ", "Math");
        l1.put("College ", "Met");
        l1.put("College ", "Met");
        // l1.clear();
        l1.lastEntry(); 
        
        System.out.println(l1);

        // first value replace by second duplicate value
        // Duplicates not allowed
        // Insertion order is preserved
        // put method is used
    }
    
}
