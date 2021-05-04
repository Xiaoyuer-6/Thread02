package thread.thread_0427;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HuYu
 * Date: 2021-04-28
 * Time: 17:39
 */
/*
中断一个线程
1。使用全局自定义的变量来终止线程
比较温柔，拿到终止指令后并不会立马终止，而是执行完这一次任务后终止
2.使用线程自带的终止方法  interrupt来终止
3.使用线程提供的stop方法来终止（废弃，存在安全隐患）
 */
public class ThreadDemo17 {
    //①，自定义变量
    private static boolean flag = false;

    public static void main(String[] args) throws InterruptedException {
        //转账线程启动
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                //转账操作
                while (!flag){
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("正在转帐");
                }
                System.out.println("转账终止啦！");
            }
        });
        t1.start();


        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(310);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("终止转账，有内鬼！");//改变变量的状态来终止执行
                flag = true;
            }
        });

        t2.start();

        t1.join();
        t2.join();




    }
}
