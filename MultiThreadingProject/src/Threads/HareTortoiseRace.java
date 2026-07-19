package Threads;

class RaceThread extends Thread {

    private static boolean raceOver = false;

    RaceThread(String name) {
        super(name);
    }

    public void run() {
        for (int i = 1; i <= 100 && !raceOver; i++) {

            System.out.println(getName() + " : " + i + " meters");

            if (getName().equals("Hare") && i == 60) {
                System.out.println("Hare is sleeping...");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                }
            }

            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
            }

            if (i == 100 && !raceOver) {
                raceOver = true;
                System.out.println("\n*** " + getName() + " wins the race! ***");
            }
        }
    }
}

public class HareTortoiseRace {

    public static void main(String[] args) {

        RaceThread hare = new RaceThread("Hare");
        RaceThread tortoise = new RaceThread("Tortoise");
        hare.setPriority(Thread.MAX_PRIORITY);
        tortoise.setPriority(Thread.MIN_PRIORITY);

        hare.start();
        tortoise.start();
    }
}