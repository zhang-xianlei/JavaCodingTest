package javacoding.versionFour;

public class GetThread {
    public static void main(String[] args){
        Thread mainThread = Thread.currentThread();
        System.out.println("the name of the thread " + mainThread.getName());
    }
}
