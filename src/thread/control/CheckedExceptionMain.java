package thread.control;

public class CheckedExceptionMain {

    public static void main(String[] args) throws Exception {

    }

    static class CheckedRunnable implements Runnable {
        @Override
        public void run() {
//            throw new Exception(); 주석 풀면 예외
        }
    }

}
