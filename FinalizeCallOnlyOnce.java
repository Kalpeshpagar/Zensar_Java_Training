public class FinalizeCallOnlyOnce {
   
    static FinalizeCallOnlyOnce f;


    public static void main(String[] args) throws InterruptedException {
        FinalizeCallOnlyOnce f1 = new FinalizeCallOnlyOnce();
        System.out.println("HashCode of f1 : " + f1.hashCode());
        f1 = null;
        System.gc();
        Thread.sleep(5000);

        System.out.println("HashCode of f : " + f.hashCode());
        f = null;
        System.gc();
        Thread.sleep(1000);

        System.out.println("I am in main");
    }

    public void finalize() {
        System.out.println("I am in finalize");
        f = this;
    }
}
