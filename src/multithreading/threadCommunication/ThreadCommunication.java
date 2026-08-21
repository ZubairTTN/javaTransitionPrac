package multithreading.threadCommunication;

/* Note: wait(); | notify() | notifyAll() are used with synchronized
 * Key Rule: Must be called inside a synchronized block or method, otherwise Java throws an IllegalMonitorStateException*/
class SharedResources {
    private int data;
    private boolean hasData;

    public synchronized void produce(int value) {
        while (hasData) {
            try {
                wait();
            } catch (Exception e) {
                Thread.currentThread().interrupt();
            }
        }
        data = value;
        hasData = true;
        System.out.println("Produced: " + value);
        notify();
    }

    public synchronized int consume() {
        while (!hasData) {
            try {
                wait();
            } catch (Exception e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println("Consumed: " + data);
        hasData = false;
        notify();
        return data;
    }

}

class Producer implements Runnable {
    private SharedResources resources;

    public Producer(SharedResources resources) {
        this.resources = resources;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            resources.produce(i);
        }
    }
}

class Consumer implements Runnable {
    private SharedResources resources;

    public Consumer(SharedResources resources) {
        this.resources = resources;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            resources.consume();
        }

    }
}

public class ThreadCommunication {
    public static void main(String[] args) {
        SharedResources resource = new SharedResources();
        Thread producerThread = new Thread(new Producer(resource));
        Thread consumerThread = new Thread(new Consumer(resource));

        producerThread.start();
        consumerThread.start();
    }
}
