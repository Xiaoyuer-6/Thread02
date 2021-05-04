package thread.thread_0429;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HuYu
 * Date: 2021-04-29
 * Time: 20:41
 */
public class ThreadDemo32 {
    //全局变量
    private static int number = 0;
    private static final int maxsize = 100000;

    public static void main(String[] args) throws InterruptedException {

        Lock lock = new ReentrantLock();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < maxsize; i++) {
                    //加锁
                    lock.lock();
                    try {
                        number++;
                    }finally {
                        //3、释放锁
                        lock.unlock();
                    }//如果将lock（）方法放在try里面，那么当try里面的代码出现异常之后，那么会执行finally里面的，还没加锁成功就会释放锁
                    //如果将lock（）方法放在try里面，那么执行finally里面释放锁的代码的时候就会报错（线程状态异常）。释放锁会
                    //覆盖原来finally里面的值
                }
            }
        });
        t1.start();


        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < maxsize; i++) {
                    lock.lock();
                    try {
                        number--;
                    }finally {
                        lock.unlock();
                    }
                }
            }
        });
        t2.start();

        //等待线程执行完
        t1.join();
        t2.join();

        System.out.println("最终结果" + number);
    }
}
