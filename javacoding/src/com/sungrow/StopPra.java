package com.sungrow;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StopPra {
    private static String command = "";
    public static void main(String[] args){
        Thread t1 = new Thread(() -> {
            while(!command.equalsIgnoreCase("exit")){
                System.out.println("loading...");
                try{
                    Thread.sleep(5000);
                }catch(InterruptedException e) {

                }
            }
            System.out.println("执行完成");
        });
        t1.start();
        try(InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir)){
            command = in.readLine();
        }catch(IOException e){

        }
    }
    
}
