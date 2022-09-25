package com.sungrowCharger;

public class HandleSell {
    public static void main(String[] args) {
        TicketDB db = new TicketDB();
        Thread t1 = new Thread(() -> {
            while (true) {
                if (!job(db)) {
                    break;
                }
            }
        }, "售票点1");
        t1.start();

        Thread t2 = new Thread(() -> {
            while (true) {
                if (!job(db)) {
                    break;
                }
            }
        }, "售票点2");
        t2.start();
    }

    private static boolean job(TicketDB db) {
        int currentTicketCount = db.getTicketCount();
        if (currentTicketCount > 0) {
            db.sellTicket();
        } else {
            return false;
        }

        String ThreadName = Thread.currentThread().getName();
        System.out.printf("%s - 售出第 %d 号票\n", ThreadName, currentTicketCount);
        return true;
    }
}
