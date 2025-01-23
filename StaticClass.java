class Outer {
    static class Inner {
        void dislay() {
            System.out.println("Inner static Class");
        }
    }
}

public class StaticClass {
    public static void main(String[] args) {
        Outer.Inner s = new Outer.Inner();
        s.dislay();
    }
}
