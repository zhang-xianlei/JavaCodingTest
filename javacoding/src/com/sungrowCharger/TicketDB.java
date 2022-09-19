package javacoding.src.com.sungrowCharger;

public class TicketDB {
    private int ticketCount = 5;
    public int getTicketCount(){
        return ticketCount;
    }
    public void sellTicket(){
        try{
            long sleepTime = (long) (1000 * Math.random());
            Thread.sleep(sleepTime);
        } catch(InterruptedException e){}
        ticketCount--;
    }
    
}
