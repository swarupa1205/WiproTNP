package Thread;

import java.util.Random;

class ColourTask implements Runnable {

    String colours[] = {"white", "blue", "black", "green", "red", "yellow"};

    public void run() {
        Random random = new Random();

        while (true) {
            int index = random.nextInt(colours.length);
            System.out.println(colours[index]);

            if (colours[index].equals("red")) {
                System.out.println("Red found. Stopping...");
                break;
            }

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class ColourDisplay {
    public static void main(String[] args) {
        Thread t = new Thread(new ColourTask());
        t.start();
    }
}