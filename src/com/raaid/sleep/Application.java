package com.raaid.sleep;


public class Application {
    public static void main(String[] args) throws InterruptedException {

        Printer printer = new Printer();
        Thread printerThread = new Thread(printer);
        printerThread.start();
        printerThread.interrupt();
        for(int i=0;i<100;i++){

            System.out.println("Main Thread "+i);
        }

    }
}
