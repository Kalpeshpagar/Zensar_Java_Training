class Test {
    void display() {
        System.out.println("Normal method");
    }

    static void show() {
        System.out.println("Static method");
    }
}

public class StaticMethod {
    public static void main(String[] args) {
        Test t = new Test();
        t.display();

        Test.show();
    }
}
