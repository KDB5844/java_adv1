package thread.start;

import util.MyLogger;

public class StartTest4Main {

    public static void main(String[] args) {
        Thread threadA = new Thread(new RunnableA(), "Thread-A");
        Thread threadB = new Thread(new RunnableB(), "Thread-B");
        threadA.start();
        threadB.start();

    }

    static class RunnableA implements Runnable {
        @Override
        public void run() {
            try {
                while (true) {
                    MyLogger.log("A");
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    static class RunnableB implements Runnable {
        @Override
        public void run() {
            try {
                while (true) {
                    MyLogger.log("B");
                    Thread.sleep(500);
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
