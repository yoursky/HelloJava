package thread;

public class TestThread {
    Object object = new Object();
    int i = 10;

    public static void main(String args[]) {
        TestThread test = new TestThread();
        MyThread t0 = test.new MyThread();
        MyThread t1 = test.new MyThread();
        t0.start();
        t1.start();
    }

    class MyThread extends Thread {
        @Override
        public void run() {
            synchronized (object) {
                i++;
                System.out.println("i="+i);
                String tn = Thread.currentThread().getName();

                try {
                    System.out.println("Current thread: " + tn + " is going to sleep");
                    Thread.currentThread().sleep(10000);
                } catch (InterruptedException e) {
                    // handle ex
                }

                System.out.println("Current thread: " + tn + " is going to sleep");
                i++;
                System.out.println("i="+i);
            }
        }
    }
}
