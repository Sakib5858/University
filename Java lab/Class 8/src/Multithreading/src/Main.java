// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws InterruptedException {
        Counter c = new Counter();

        CounterThread ct1 = new CounterThread(c);
        DecrementThread ct2 = new DecrementThread(c);
        DecrementThread ct3 = new DecrementThread(c);
        DecrementThread ct4 = new DecrementThread(c);
        DoubleThread ct5 = new DoubleThread(c);

        ct1.start();
        ct2.start();
        ct3.start();
        ct4.start();
        ct5.start();



        ct1.join();
        ct2.join();
        ct3.join();
        ct4.join();
        ct5.join();


        c.show();

    }
}