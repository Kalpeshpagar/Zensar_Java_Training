class A {
    public static void m1() {
        System.out.println("parent");
    }
}
 class B extends A {
    public static void m1() {
        System.out.println("child");
    }
}

public class DataHiding {
    public static void main(String[] args) {
        A.m1();
        B.m1();
    }
}
