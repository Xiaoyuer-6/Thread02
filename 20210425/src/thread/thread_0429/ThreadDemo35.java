package thread.thread_0429;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HuYu
 * Date: 2021-04-29
 * Time: 19:26
 */
public class ThreadDemo35 {
    //全局变量
    private static int number = 0 ;
    private static final int maxsize = 100000;


    //
    public static void main(String[] args) throws InterruptedException {
        //
        Object lock = new Object();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <maxsize ; i++) {
                    //1、尝试获取锁，成功获取锁
                    //2、lock(count=0)
                    //3、calc，变为1；
                    //4.save count=1;
                    //5.释放锁
                    synchronized (lock) {
                        number++;
                    }
                }


            }
        });
        t1.start();



        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <maxsize ; i++) {
                    //1、获取锁失败，被1占了.排队等待
                    //2、等待
                    //3、等待
                    //4.等待
                    //5.获得锁
                    //6.lock(count = 1)；
                    //7、calc-1；
                    //8.save  count=0；
                    synchronized(lock) {
                        number--;
                    }
                }
            }
            public static synchronized  void decrement(){

            }
            public synchronized void increment(){

            }
        });
        t2.start();

        //等待线程执行完
        t1.join();
        t2.join();

        System.out.println("最终结果"+number);
    }
}

