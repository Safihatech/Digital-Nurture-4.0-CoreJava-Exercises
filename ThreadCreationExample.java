

class MyThread extends Thread {
    private String message;

    MyThread(String msg) {
        this.message = msg;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(message + " - " + i);
        }
    }
}

public class ThreadCreationExample {
    public static void main(String[] args) {
        MyThread t1 = new MyThread("Thread 1");
        MyThread t2 = new MyThread("Thread 2");

        t1.start();
        t2.start();
    }
}

/*output:
Thread 1 - 0
Thread 1 - 1
Thread 2 - 0
Thread 1 - 2
Thread 2 - 1
Thread 1 - 3
Thread 1 - 4
Thread 2 - 2
Thread 2 - 3
Thread 2 - 4*/
