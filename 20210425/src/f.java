import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HuYu
 * Date: 2021-04-25
 * Time: 15:28
 */
public class f {
    public static void main(String[] args) {
String fool1 = args[1];
String fool2 = args[2];
        String fool3 = args[3];
    }
    }
//        Scanner sc = new Scanner(System.in);
//        while (sc.hasNext()) {
//        byte n = sc.nextByte();
//        int count = 0;
//        int Max = 0;
//        while (n != 0) {//为0说明全为0/无符号右移结束，不必执行
//            if ((n & 1) == 1) {
//                count++;
//                Max = count;//如果一直连续是1的话，Max就是count的值，
//            } else {
//                count = 0;
//                Max = Max;//遇到0时，Max的值就是之前有过连续1的最大值；
//            }
//            n >>>= 1;//无符号右移，左边加0，对结果无影响；
//        }
//        System.out.println(Max);
//    }
//}
//}
//import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HuYu
 * Date: 2021-04-25
 * Time: 15:28
 */
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        while (sc.hasNext()) {
//            //byte n = sc.nextByte();
//            int n = sc.nextInt();
//            int count = 0;
//            int Max = 0;
//            while (n != 0) {//为0说明全为0/无符号右移结束，不必执行
//                if ((n & 1) == 1) {
//                    count++;
//                    //Max = count;//如果一直连续是1的话，Max就是count的值，
//                    Max=Math.max(Max,count);
//                } else {
//                    count = 0;
//                    //Max = Max;//遇到0时，Max的值就是之前有过连续1的最大值；
//                }
//                n >>>= 1;//无符号右移，左边加0，对结果无影响；
//            }
//            System.out.println(Max);
//        }
//    }
//}
//        import java.util.*;
//
//public class LCA {
//    public int getLCA(int a, int b) {
//        // write code here
//        while(a!=b){
//            if(a>b){
//                a=a/2;
//            }else{
//                b= b/2;
//
//            }
//        }
//        return a;
//    }
//}