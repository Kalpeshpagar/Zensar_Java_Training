public class ThreadSchedular {

    // Thread Scheduler is the Operating System service that allocates the CPU time to the available threads.
    // There are two types of thread schedulers:
    // 1. Preemptive Scheduling
    // 2. Time Slicing
    public static void main(String[] args) {
        Mythread m1 = new Mythread();
        Mythread m2 = new Mythread();
        Mythread m3 = new Mythread();

        m1.setName("Thread 1");
        m2.setName("Thread 2");
        m3.setName("Thread 3");

        m1.start();
        m2.start();
        m3.start();
    }

}

class Mythread extends Thread {
    public void run() {
        String s = Thread.currentThread().getName();
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread Name is : "+s);
       }
    }
}
// 