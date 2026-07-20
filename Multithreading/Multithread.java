//both classes are create a thread with extends a thread
/*
class thread1 extends Thread {
    @Override
    public void run() {

        while (true) {
            System.out.println("Thread one is cooking eggs");
        }

    }
}

class thread2 extends Thread {
    @Override
    public void run() {

        while (true) {
            System.out.println("Thread two is cooking Chawal");
        }

    }
} */

// both classes are create a thread with extends a thread

//Start a Runnable interfaces and creating a thread

class Runnableinterface1 implements Runnable {

    public void run() {
        while (true) {
            System.out.println("Thread 1 is running");
        }
    }
}

class Runnableinterface2 implements Runnable {

    public void run() {
        while (true) {
            System.out.println("Thread 2 is running");
        }
    }
}

public class Multithread {
    public static void main(String args[]) {
        // thread1 t1 = new thread1();
        // thread2 t2 = new thread2();

        // t1.start();
        // t2.start();

        Runnableinterface1 c1 = new Runnableinterface1();
        Thread t1 = new Thread(c1);

        Runnableinterface2 c2 = new Runnableinterface2();
        Thread t2 = new Thread(c2);

        t1.start();
        t2.start();

    }
}
