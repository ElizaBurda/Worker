package WorkerTask;

public class Worker {

    private final OnTaskDoneListener callback;
    private final OnTaskErrorListener errorCallback;

    public Worker(OnTaskDoneListener callback, OnTaskErrorListener errorCallback) {
        this.callback = callback;
        this.errorCallback = errorCallback;
    }

    public void start(int x) {
        for (int i = 0; i < 100; i++) {
            if (i == x) {
                errorCallback.onError("Task " + i + " is error");
            }
            callback.onDone("Task " + i + " is done");
        }
    }

}