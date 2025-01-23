import java.util.Date;

public class Runtime1 {
    public static void main(String[] args) {
        Runtime r = Runtime.getRuntime();
        System.out.println("Freememory :" + r.freeMemory());
        System.out.println("Total Memory :" + r.totalMemory());
        for (int i = 0; i < 1000; i++) {
            Date d = new Date();
            d = null;
        }
        System.out.println("FreeMemory :" + r.freeMemory());
        r.gc();
        System.out.println("FreeMemory :" + r.freeMemory());
        System.out.println("Total Memory :" + r.totalMemory());

    }
}
