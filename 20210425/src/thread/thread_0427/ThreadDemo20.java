package thread.thread_0427;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HuYu
 * Date: 2021-04-28
 * Time: 19:32
 */
public class ThreadDemo20 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <10 ; i++) {
                    System.out.println(Thread.currentThread().isInterrupted());//不会复位线程终止状态，其他人不会去用。
                   // System.out.println(Thread.interrupted());//执行判断线程终止为true后，就会将状态重置为false；
                    // 因为是全局变量，要使用之后其他人也可使用

                }
            }
        });
        t1.start();


        //终止线程
        t1.interrupt();
    }
}
