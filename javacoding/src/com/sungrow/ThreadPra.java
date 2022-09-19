package javacoding.src.com.sungrow;

public class ThreadPra {
    public static void main(String[] args){
        Thread t1 = new Thread(new Runner());
        t1.start();
        Thread t2 = new Thread(new Runner(), "MyThread");
        t2.start(); 
    }
}
