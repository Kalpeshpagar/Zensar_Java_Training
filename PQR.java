interface abc {
    default void m1() {
        System.out.println("m1");
    }
}
interface xyz {
    default void m1() {
        System.out.println("m2");
    }
}

public class PQR implements abc, xyz {
   
    public static void main(String[] args) {
        PQR p = new PQR();
        p.m1();
    }

    @Override
    public void m1() {
        // TODO Auto-generated method stub
        abc.super.m1();
    }

   }
