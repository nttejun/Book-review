package rule66;

import java.util.concurrent.TimeUnit;

// 스레드 종료 volatile 방식
public class StopThreadVolatile {
    private static volatile boolean stopRequested;

    public static void main(String[] args) throws InterruptedException{
        Thread backgroundThread = new Thread(new Runnable() {
            @Override
            public void run() {
                int i = 0;
                while (!stopRequested)
                    i++;
                // 1초 성능 비교 synchronized 보다 좋은 성능과 간결한 구현의 volatile
                System.out.print("run " + i);
            }
        });
        backgroundThread.start();

        TimeUnit.SECONDS.sleep(1);
        stopRequested = true;
    }
}
