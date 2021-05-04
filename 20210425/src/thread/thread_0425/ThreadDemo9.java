//package thread.thread_0425;
//
//import java.util.Random;
//import java.util.concurrent.Callable;
//import java.util.concurrent.Future;
//import java.util.concurrent.FutureTask;
//
///**
// * Created with IntelliJ IDEA.
// * Description:
// * User: HuYu
// * Date: 2021-04-25
// * Time: 19:54
// */
///*
//创建并得到现成的结果
// */
//public class ThreadDemo9 {
//    static class MyCallable implements Callable<Integer>{
//        @Override
//        public Integer call() throws Exception {
//            int num = new Random().nextInt();
//            System.out.println("----"+Thread.currentThread().getName());
//            return num;
//        }
//    }
//
//    public static void main(String[] args) {
//        //
//        MyCallable myCallable = new MyCallable();
//        FutureTask<Integer> = new
//    }
//
//}
