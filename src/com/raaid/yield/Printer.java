package com.raaid.yield;

public class Printer extends Thread {

    @Override
    public void run() {
        for(int i=0;i<100;i++){
            Thread.yield();
            System.out.println("Child Thread "+i);
        }
    }
}
