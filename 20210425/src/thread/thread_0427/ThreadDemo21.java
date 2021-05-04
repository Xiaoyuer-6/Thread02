package thread.thread_0427;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HuYu
 * Date: 2021-04-28
 * Time: 20:25
 */
/*
等待一个线程
eg：让第一个线程执行完在执行第二个线程
张三和李四轮流开出租车,公共任务
 */
public class ThreadDemo21 {
    public static void main(String[] args) throws InterruptedException {
        Runnable runnable =new Runnable() {//定义公共任务
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"上班");
                try {
                    Thread.sleep(1000);//表示工作时间
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+"下班");
            }
        };

        Thread t1 = new Thread(runnable,"张三");
        t1.start();
/*
如何等待
 */
        t1.join(1000);
        Thread t2 = new Thread(runnable,"李四");
        t2.start();



    }
}
