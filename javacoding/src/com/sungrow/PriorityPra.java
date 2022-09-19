package javacoding.src.com.sungrow;

public class PriorityPra {
    public static void main(String[] args){
        Thread t1 = new Thread(new Runner());
        t1.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        Thread t2 = new Thread(new Runner(), "priorityThreadT2");
        t2.setPriority(Thread.MAX_PRIORITY);
        t2.start();
    }
}
