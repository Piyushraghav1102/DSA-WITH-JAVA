
class threadcons extends Thread {
    public threadcons(String name) {
        super(name);
    }

    public void Run() {
        while (true) {
            System.out.println("Thread constructor is running properly");
        }
    }
}

public class Threadcons1 {
    public static void main(String[] args) {

        threadcons t1 = new threadcons("Piyush");
        t1.start();
        System.out.println("This is the id of thread " + t1.getId());
    }
}
