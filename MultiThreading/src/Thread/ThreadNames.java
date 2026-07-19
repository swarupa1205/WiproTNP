package Thread;

class MyThread extends Thread {

    MyThread(String name) {
        super(name);
    }

    public void run() {
        System.out.println("Thread Name: " + Thread.currentThread().getName());
    }
}

public class ThreadNames {
    public static void main(String[] args) {

        MyThread t1 = new MyThread("Scooby");
        MyThread t2 = new MyThread("Shaggy");

        t1.start();
        t2.start();
    }
}