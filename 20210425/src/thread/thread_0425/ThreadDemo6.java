package thread.thread_0425;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HuYu
 * Date: 2021-04-25
 * Time: 19:44
 */
public class ThreadDemo6 {
    static class MyRunnable implements Runnable{
        @Override
        public void run() {
            System.out.println("线程是"+Thread.currentThread().getName());
        }
    }

    public static void main(String[] args) {
        //1、
        MyRunnable runnable = new MyRunnable();
        //2、
        Thread thread = new Thread(runnable);
        thread.start();
    }
}
