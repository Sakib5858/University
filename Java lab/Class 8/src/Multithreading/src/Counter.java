public class Counter {
    private int count;

    public Counter() {
        this.count = 0;
    }
    public synchronized void increment()
    {
        count++;
    }
    public synchronized void decrement(){
        count--;
    }
    public synchronized void doublee(){
        count = count*2;
    }
    public void show(){
        System.out.println("Count = " + count);
    }
}
