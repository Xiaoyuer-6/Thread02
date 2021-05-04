package thread.thread_0425;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HuYu
 * Date: 2021-04-25
 * Time: 19:34
 */
//1、继承Thread类
public class ThreadDemo4 {
    static class MyThread extends Thread{
        @Override
        public void run(){
            System.out.println("线程为"+Thread.currentThread().getName());
        }
    }

    public static void main(String[] args) {
        Thread t1 = new MyThread();
        t1.start();
        System.out.println("当前线程名称"+Thread.currentThread().getName());
    }
}
