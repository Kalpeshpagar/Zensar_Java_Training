public class Lambda_Thread {
    public static void main(String[] args) {
        Runnable r = () -> {
            for (int i = 1; i <= 10; i++) {
                System.out.println(i * 5);
            }
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
               System.out.println(e);
            }
            String s=null;
            if (s==null) {
                System.out.println("String is empty");
                
            } else {
                System.out.println(s.length());
            }
        };
        Thread t = new Thread(r);
        t.start();
        System.out.println(t);
    }
}

// lambda expression is a new and important feature of Java which was included
// in Java SE 8. It provides a clear and concise way to represent one method
// interface using an expression. It is very useful in collection library. It
// helps to iterate, filter and extract data from collection.
