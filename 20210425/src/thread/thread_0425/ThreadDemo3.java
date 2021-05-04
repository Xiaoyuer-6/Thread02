package thread.thread_0425;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HuYu
 * Date: 2021-04-25
 * Time: 19:09
 */
public class ThreadDemo3 {

    private static final long count = 1_0000_0000L;
    public static void main(String[] args) {
        //
        //System.out.println(Thread.currentThread().getName());


        concorrency();
        //调用单线程方法；
        serial();

    }

    private static void serial() {
        Long stime  = System.currentTimeMillis();
        System.nanoTime();//记录当前时间的纳秒数
        int a =0;
        for (int i = 0; i <3*count ; i++) {
            a++;
        }
        Long etime  = System.currentTimeMillis();
        System.out.println("单线程执行了"+(etime-stime));
    }

    //多线程的方法
    private static void concorrency() {
        Long stime  = System.currentTimeMillis();

        //todo:执行30亿次循环
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                //具体业务
                int a=0;
                for (int i = 0; i < count; i++) {
                    a++;
                }

            }
        });
        //开始执行线程
        t1.start();
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                //具体业务
                int b=0;
                for (int i = 0; i < count; i++) {
                    b++;
                }

            }
        });
        //开始执行线程
        t2.start();
        int c = 0;
        for (int i = 0; i < count; i++) {
            c++;

        }
//        t1.join();
//        t2.join();
        Long etime  = System.currentTimeMillis();
        System.out.println("多线程执行了"+(etime-stime));
    }
}
