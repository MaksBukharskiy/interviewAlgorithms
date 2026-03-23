package StepThread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService pool = Executors.newFixedThreadPool(4);
        int counter = 2;

        for (int i = 0; i < counter; i++){
            StepCoordinator coordinator = new StepCoordinator();

            pool.submit(new Worker(coordinator, true));
            pool.submit(new Worker(coordinator, false));
        }

        Thread.sleep(5000);
        pool.shutdownNow();

        System.out.println("The end");
    }

}
