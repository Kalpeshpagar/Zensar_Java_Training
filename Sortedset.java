import java.util.SortedSet;
import java.util.TreeSet;
import java.util.Comparator;

class Mycomparator implements Comparator<Integer> {
    public int compare(Integer o1, Integer o2) {
        // Integer obj1 = (Integer) o1;
        // Integer obj2 = (Integer) o2;
        return o2.compareTo(o1);
    }
}

public class Sortedset {
    public static void main(String[] args) {

        SortedSet<Integer> s1 = new TreeSet<Integer>(new Mycomparator());
        s1.add(10);
        s1.add(20);
        s1.add(30);
        s1.add(60);
        s1.add(609);
        s1.add(550);
        s1.add(660);
        s1.add(80);
        s1.add(90);
        s1.add(100);
        System.out.println(s1);
        // s1.comparator();
        // System.out.println(descendingComparator());
    }
    //
    // output : [10, 20, 30, 40, 50, 60, 70, 80, 90, 100]
    // order is preserved in TreeSet
    // TreeSet is sorted in ascending order
    // TreeSet is not synchronized
    // TreeSet is not thread safe

}