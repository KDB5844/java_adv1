import thread.start.HelloThread;

public class Main {

    public static void main(String[] args) {
        Thread t1 = new HelloThread();
        t1.start();
    }
}