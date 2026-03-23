package StepThread;

public class Worker implements Runnable{
    private final StepCoordinator coordinator;
    private final boolean isFirst;

    public Worker(StepCoordinator coordinator, boolean isFirst){
        this.coordinator = coordinator;
        this.isFirst = isFirst;
    }

    @Override
    public void run(){
        while (!Thread.currentThread().isInterrupted()) {
            try {
                if (isFirst) {
                    coordinator.firstStep();
                } else {
                    coordinator.secondStep();
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                break;
            }
        }
    }
}
