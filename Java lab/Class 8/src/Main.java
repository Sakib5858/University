// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws InterruptedException {
        Counter c = new Counter();

        CounterThread ct1 = new CounterThread(c);
        CounterThread ct2 = new CounterThread(c);
        CounterThread ct3 = new CounterThread(c);
        CounterThread ct4 = new CounterThread(c);
        CounterThread ct5 = new CounterThread(c);

        ct1.start();
        ct2.start();



        ct1.join();
        ct2.join();

        c.show();

    }
}