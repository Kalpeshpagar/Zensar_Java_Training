public class RunnableThread {
    public static void main(String[] args) {
        Mythread m = new Mythread();

    
        for (int i = 0; i < 5; i++) {
            System.out.println("Main Thread");
        }
        Thread t = new Thread(m);
        t.start(); // start method calls run method

    }
}

class Mythread implements Runnable {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Child Thread");
        }

        int c = 10+5;
        System.out.println("Sum is : " + c);

        int d = 10 - 5;
        System.out.println("Sub is : "+d);
        
        for (int i = 1; i < 5; i++) {
            System.out.println("5 * " + i + " = " + 5 * i);
        }
    }

}

