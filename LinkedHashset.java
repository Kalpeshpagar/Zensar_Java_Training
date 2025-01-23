import java.util.LinkedHashSet;

public class LinkedHashset {
    public static void main(String args[]) {
        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
        lhs.add(10);
        lhs.add(20);
        lhs.add(30);
        lhs.add(40);
        lhs.add(50);
        lhs.add(60);
        lhs.add(70);
        lhs.add(80);
        lhs.add(90);
        lhs.add(100);
        System.out.println(lhs);
    }
}
// order is preserved in LinkedHashSet
// output : [10, 20, 30, 40, 50, 60, 70, 80, 90, 100]