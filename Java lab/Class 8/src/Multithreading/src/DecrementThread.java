public class DecrementThread extends Thread{
    private Counter c;

    public DecrementThread(Counter c) {
        this.c = c;
    }

    public void run() {
        // super.run();

        for (int i = 0; i < 100; i++)
           c.decrement();
    }
}
