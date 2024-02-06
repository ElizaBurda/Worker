package WorkerTask;

@FunctionalInterface
interface OnTaskDoneListener {
    void onDone(String result);

}

@FunctionalInterface
interface OnTaskErrorListener {
    void onError(String result);

}

public class Main {
    public static void main(String[] args) {
        OnTaskDoneListener listener = System.out::println;
        OnTaskErrorListener listenerE = System.out::println;

        Worker worker = new Worker(listener, listenerE);
        worker.start(71);

    }

}