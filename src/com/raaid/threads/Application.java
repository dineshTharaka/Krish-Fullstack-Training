package com.raaid.threads;

public class Application {
    public static void main(String[] args) {

        Printer printer = new Printer();
        printer.start();
        for(int i=0;i<100;i++){
            System.out.println("Main Thread "+i);
        }

    }
}
