package javacoding.src.com.sungrowCharger;

public class HandleSellSync {
    public static void main(String[] args){
        TicketDB db = new TicketDB();
        Thread t1 = new Thread(() -> {
            while(true){
                if(!job(db)){
                    break;
                }
                try{
                    Thread.sleep(1000);
                } catch(InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "Ticket lobby one");
        t1.start();

        Thread t2 = new Thread(() -> {
            while(true){
                if(!job(db)){
                    break;
                }
                try{
                    Thread.sleep(1000);
                } catch(InterruptedException e){
                    e.printStackTrace();
                }
            }
        }, "Ticket lobby two");
        t2.start();
    }

    private synchronized static boolean job(TicketDB db){
        int currTicketAccount = db.getTicketCount();
        if(currTicketAccount > 0) {
            db.sellTicket();
        } else {
            return false;
        }
        String threadName = Thread.currentThread().getName();
        System.out.printf("%S -- selling the %d ticket. \n", threadName, currTicketAccount);
        return true;
    }
}
