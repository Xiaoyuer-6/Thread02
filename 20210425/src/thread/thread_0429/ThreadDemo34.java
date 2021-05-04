package thread.thread_0429;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HuYu
 * Date: 2021-04-29
 * Time: 21:04
 */
public class ThreadDemo34 {
    public static void main(String[] args) throws InterruptedException {
        //声明公平锁
        Lock lock = new ReentrantLock(true);
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                for (char item : "ABCD".toCharArray()){
                    lock.lock();
                    try {


                        System.out.println(item);
                    }finally {
                        lock.unlock();
                    }
                }
            }
        };

        Thread t1= new Thread(runnable,"t1");
        Thread t2= new Thread(runnable,"t2");

        Thread.sleep(1000);
        t1.start();
        t2.start();
    }
}
