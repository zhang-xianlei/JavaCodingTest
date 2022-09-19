package javacoding.src.com.sungrow;

public class MyThread extends Thread{
    public MyThread(){
        super();
    }

    public MyThread(String name){
        super(name);
    }

    @Override
    public void run(){
        for(int i = 0; i < 10; i++){
            System.out.printf("the %d time running - %s \n", i, getName());
            try{
                long sleepTime = (long) (1000 * Math.random());
                sleep(sleepTime);
            } catch(InterruptedException e){}
        }
        System.out.println("running over " + getName());
    }
}

