package thread.thread_0427;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HuYu
 * Date: 2021-04-28
 * Time: 19:01
 */
/*
使用interrupt来终止
 */
public class ThreadDemo18 {
    public static void main(String[] args) throws InterruptedException {
        //转账
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                while (!Thread.interrupted()){//非终止情况下一直循环，只判断线程的终止状态，
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        //e.printStackTrace();
                        break;//异常跳出，真正终止的是break
                    }
                    System.out.println("正在转帐");
                }
                System.out.println("终止线程");
            }
        });
        t1.start();

        Thread.sleep(310);
        System.out.println("停止交易");
        //想要终止t1
        t1.interrupt();//用来终止线程，只发命令，终止考循环里的break

    }
}
