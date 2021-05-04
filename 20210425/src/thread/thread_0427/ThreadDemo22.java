package thread.thread_0427;

import javax.swing.plaf.nimbus.State;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HuYu
 * Date: 2021-04-28
 * Time: 20:42
 */
/*
查看进程的所有状态
 */
public class ThreadDemo22 {
    public static void main(String[] args) {
        //打印送有的线程
        for (Thread.State item:Thread.State.values()){
            System.out.println(item);
        }
    }
}
