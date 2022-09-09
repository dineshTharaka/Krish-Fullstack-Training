package com.raaid.sleep;

public class Printer implements Runnable {

    @Override
    public void run() {
        for(int i=0;i<10;i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Child Thread "+i);
        }
    }
}
