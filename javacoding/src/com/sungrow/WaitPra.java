package javacoding.src.com.sungrow;

public class WaitPra {
    static int value = 0;
    public static void main(String[] args) throws InterruptedException{
        System.out.println("主线程开始...");
        Thread t1 = new Thread(() -> {
            System.out.println("t1 线程 开始...");
            for( int i = 0; i < 2; i++) {
                System.out.printf("t1线程执行...% d\n", i);
                value++;
            }
            System.out.println("t1线程执行..." + value);
        });
        t1.start();
        System.out.println("主线程被阻塞，等待t1结束...");
        t1.join();

        System.out.println("value = " + value);
        System.out.println("主线程继续执行");
    }
    
}
