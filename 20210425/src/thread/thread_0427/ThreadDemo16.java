package thread.thread_0427;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HuYu
 * Date: 2021-04-28
 * Time: 08:43
 */
/*
启动一个线程
 */
public class ThreadDemo16 {

    static class MyThread  extends Thread{
        @Override
        public void run() {
                System.out.println("线程名："+Thread.currentThread().getName());
            }
        }


        public static void main(String[] args) {
            MyThread thread = new MyThread();
            thread.setName("张三");
       // System.out.println(Thread.currentThread().isDaemon());//是否是守护线程，不是。说明main是用户线程
//    Thread thread = new Thread(()->{
//        System.out.println("线程名："+Thread.currentThread().getName());
//    },"张三");

    //start和run夫人区别是啥，start是官方用来启动线程的，调用run方法就是调用普通方法
    thread.start();//调用时名字不变，正经去启动方程
            thread.start();
      //thread.run();
      //thread.run();
    }


    //todo：
    //run方法和start方法的区别是：
    //1，run方法属于普通方法，而start属于启动线程的方法
    //2.run方法可以启动多次，而start方法只能 执行一次
}
