package thread.thread_0425;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HuYu
 * Date: 2021-04-25
 * Time: 20:29
 */
//两个线程实现AABBCCDD
public class ThreadDemo11 {
    public static void main(String[] args) {


        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                String data = "ABCD";
                for (char item : data.toCharArray()) {
                    System.out.println(item);
                }
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
//        public static void main(String[] args) throws InterruptedException {
//            char [] ch = {'A','B','C','D'};
//            Thread thread = new Thread(new Runnable() {
//                @Override
//                public void run() {
//                    for (int i = 0; i <ch.length ; i++) {
//                        System.out.println("线程名"+Thread.sleep();
//                    }
//                }
//            });
//
//            thread.start();
//            Thread.sleep(1000);
//        }
        Thread thread1 = new Thread();
        Thread thread2 = new Thread();
        thread1.start();
        thread2.start();
    }
}

