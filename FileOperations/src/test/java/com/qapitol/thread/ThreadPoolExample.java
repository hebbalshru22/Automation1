package com.qapitol.thread;

    import java.util.concurrent.*;

    public class ThreadPoolExample {
        public static void main(String[] args) {
            // Create a thread pool with 4 threads
            ExecutorService executorService = Executors.newFixedThreadPool(4);

            // Submit 10 tasks to the thread pool
            for (int i = 0; i < 10; i++) {
                executorService.submit(new RunnableTask(i));
            }

            // Shut down the executor service gracefully
            executorService.shutdown();
        }
    }

    class RunnableTask implements Runnable {
        private final int taskId;

        public RunnableTask(int taskId) {
            this.taskId = taskId;
        }

        @Override
        public void run() {
            System.out.println("Task " + taskId + " is being executed by " + Thread.currentThread().getName());
            try {
                // Simulate some work
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            System.out.println("Task " + taskId + " completed by " + Thread.currentThread().getName());
        }
    }


