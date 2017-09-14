package Threads;

public class createThriads extends Thread {

    String name;
    Counter count = new Counter();


    public createThriads(String name) {
        this.name = name;
    }

    public void run() {

        for (int i = 0; i < 50; i++) {

            count.counter();
            try {
                sleep(3);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(name + " thread say: " + count.getCount());
        }
    }
}
