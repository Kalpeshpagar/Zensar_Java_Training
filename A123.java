import java.util.*;


interface LEA {
   
    public abstract int sum(int a, int b);

    default void m1() {
        System.out.println("I am in Default Method");
    }

}
public class A123 {
    public static void main(String[] args) {
        LEA a1 = (a, b) -> a + b;
        a1.m1();
        System.out.println(a1.sum(5,6));
    }
}
