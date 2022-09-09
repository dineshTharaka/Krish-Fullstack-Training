package com.raaid.joins;


public class Application {
    public static void main(String[] args) throws InterruptedException {

        Printer printer = new Printer();
        Thread thread = new Thread(printer);
        thread.start();
        thread.join();
        for(int i=0;i<100;i++){
            System.out.println("Main Thread "+i);
        }

    }
}
