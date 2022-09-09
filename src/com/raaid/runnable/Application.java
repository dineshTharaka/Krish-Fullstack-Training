package com.raaid.runnable;

public class Application {
    public static void main(String[] args) {

        Printer printer = new Printer();
        Thread thread = new Thread (printer);
        thread.setPriority(7);
        thread.start();
        for(int i=0;i<100;i++){
            System.out.println("Main Thread "+i);
        }

    }
}
