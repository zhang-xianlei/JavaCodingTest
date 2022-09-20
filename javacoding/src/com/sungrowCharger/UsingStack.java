package javacoding.src.com.sungrowCharger;

public class UsingStack {
    public static void main(String[] args){
        Stack stack = new Stack();
        Thread producer = new Thread(() -> {
            char c;
            for(int i = 0; i < 10; i++){
                c = (char) (Math.random() * 26 + 'A');
                stack.push(c);
                System.out.println("produce: " + c);
                try{
                    Thread.sleep((int)(Math.random() * 1000));
                }catch(InterruptedException e){}
            }
        });
        Thread consumer = new Thread(() -> {
            char c;
            for(int i = 0; i < 10; i++){
                c = stack.pop();
                System.out.println("consumer: " + c);
                try{
                    Thread.sleep((int)(Math.random() * 1000));
                } catch(InterruptedException e){}
            }
        });
        producer.start();
        consumer.start();
    }
}
