package thread.start;

public class StartTest1Main {

    public static void main(String[] args) {
        CounterRunnable runnable = new CounterRunnable();
        Thread thread = new Thread(runnable, "counter");
        thread.start();
    }
}
