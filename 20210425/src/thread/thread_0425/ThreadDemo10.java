package thread.thread_0425;

import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HuYu
 * Date: 2021-04-25
 * Time: 20:26
 */
//休眠1
public class ThreadDemo10 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("kkkk："+new Date());
        //Thread.sleep(1000);
        //休眠1
        //休眠2
        TimeUnit.SECONDS.sleep(1);
        System.out.println("jjjjj："+new Date());
        //休眠2



    }
}
