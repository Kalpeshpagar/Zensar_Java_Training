 interface InnerInterfaceStaticM {
    static void sayHello() {
        System.out.println("Hello");
    }
} 

public class InterfaceStaticM implements InnerInterfaceStaticM  {
    public static void main(String[] args) {
        // InterfaceStaticM a = new InterfaceStaticM();
        // a.sayHello();  compile time error
        InnerInterfaceStaticM.sayHello();
    }
}
