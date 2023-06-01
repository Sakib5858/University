public class DoubleThread extends Thread{
    private Counter c;

    public DoubleThread(Counter c) {
        this.c = c;
    }

    public void run() {
        // super.run();

        for (int i = 0; i < 100; i++)
            c.doublee();
    }
}
