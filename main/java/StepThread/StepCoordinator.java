package StepThread;

public class StepCoordinator {
    private boolean booleanFlag = true;
    private final Object lock = new Object();

    public void firstStep() throws InterruptedException {
        synchronized (lock){
            while(!booleanFlag){
                lock.wait();
            }

            System.out.println("Step 1");
            booleanFlag = false;

            lock.notifyAll();
        }

        Thread.sleep(2000);
    }

    public void secondStep() throws InterruptedException {
        synchronized (lock){
            while(booleanFlag){
                lock.wait();
            }

            System.out.println("Step 2");
            booleanFlag = true;

            lock.notifyAll();
        }

        Thread.sleep(2000);

    }
}
