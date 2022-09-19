package javacoding.src.com.sungrow;

public class Runner implements Runnable {
    @Override
    public void run(){
        for(int i = 0; i < 10; i++){
            System.out.printf("The %d time run - %s\n", i, Thread.currentThread().getName());
        }
        try{
            long sleepTime = (long) (100 * Math.random());
            Thread.sleep(sleepTime);
        } catch(InterruptedException e){}
        System.out.println("thread is run over " + Thread.currentThread().getName());
    }
}
