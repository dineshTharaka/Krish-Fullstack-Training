package com.raaid.yield;


public class Application {
    public static void main(String[] args) {

        Printer printer = new Printer();
        printer.start();
        for(int i=0;i<10;i++){
            System.out.println("Main Thread "+i);
        }

    }
}
