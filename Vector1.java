import java.util.HashSet;
import java.util.Set;

public class Vector1 {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();

        // Adding elements to the HashSet
        hashSet.add("apple");
        hashSet.add("banana");
        hashSet.add("cherry");
        hashSet.add("cherry");
        hashSet.add("apple"); // Duplicate element, will not be added

        // Displaying the HashSet
        System.out.println("HashSet: " + hashSet);

        // Checking if an element exists
        boolean containsApple = hashSet.contains("apple");
        System.out.println("Contains 'apple': " + containsApple);

        // Removing an element
        hashSet.remove("banana");
        System.out.println("HashSet after removing 'banana': " + hashSet);

        // Iterating over the HashSet
        System.out.println("Iterating over HashSet:");
        for (String element : hashSet) {
            System.out.println(element);
        }
    }
}


// for insertion / deletion / searching operation types
// insertion order maintain or not 
// duplicate elements allowed or not
// null insertion allowed or not
// implements Serializable, Cloneable, RandomAccess interfaces or not
// best choice if our frequent operation is retrieval operation
