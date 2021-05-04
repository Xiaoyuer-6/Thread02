package thread.thread_0427;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HuYu
 * Date: 2021-04-28
 * Time: 19:19
 */
public class ThreadDemo19 {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                while (/*!Thread.interrupted()*/  //会复位，只能使用一次
                        !Thread.currentThread().isInterrupted()){//非终止情况下一直循环，只判断线程的终止状态，

                    System.out.println("正在转帐");
                }
                System.out.println("终止线程");
            }
        });
        t1.start();

        Thread.sleep(10);
        System.out.println("有内鬼，终止交易！");
        t1.interrupt();
    }
}
