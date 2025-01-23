class A {
    int a = 5;
}

class B extends A {
    int a = 10;

    void display() {
        System.out.println(a);
        System.out.println(super.a);
    }
}

public class SuperKeyword {
    public static void main(String[] args) {

        B b = new B();
        b.display();

    }
}
