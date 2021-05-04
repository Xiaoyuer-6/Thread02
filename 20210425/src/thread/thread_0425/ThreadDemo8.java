package thread.thread_0425;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HuYu
 * Date: 2021-04-25
 * Time: 19:49
 */

public class ThreadDemo8 {
    public static void main(String[] args) {
        Thread thread = new Thread(()->{
            System.out.println("---"+Thread.currentThread().getName());
        });
        thread.start();
    }
}
