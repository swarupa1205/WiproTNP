package ThreadControl;

class EvenThread extends Thread {

    public void run() {
        System.out.println("Even Numbers:");
        for (int i = 2; i <= 20; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}

class OddThread extends Thread {

    public void run() {
        System.out.println("Odd Numbers:");
        for (int i = 1; i <= 20; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}

public class EvenOddThread {
    public static void main(String[] args) throws InterruptedException {

        EvenThread t1 = new EvenThread();
        OddThread t2 = new OddThread();

        t1.start();
        t1.join();      // Wait until even thread finishes

        t2.start();
        t2.join();
    }
}