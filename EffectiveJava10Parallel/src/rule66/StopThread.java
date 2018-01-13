package rule66;

import java.util.concurrent.TimeUnit;

// 스레드 종료 동기화 방식
public class StopThread {
    private static boolean stopRequested;
    private static synchronized void requestStop(){
        stopRequested = true;
    }
    private static synchronized boolean stopRequested(){
        return stopRequested;
    }

    public static void main(String[] args)throws InterruptedException {
        Thread backgroundThread = new Thread(new Runnable() {
            @Override
            public void run() {
                int i = 0;
                while (!stopRequested())
                    i++;
                System.out.println("run " + i);

            }
        });
        backgroundThread.start();

        TimeUnit.SECONDS.sleep(1);
        requestStop();
    }
}
