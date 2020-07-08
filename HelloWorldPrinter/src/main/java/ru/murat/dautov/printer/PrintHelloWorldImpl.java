package ru.murat.dautov.printer;

public class PrintHelloWorldImpl implements IPrintHelloWorld {
    @Override
    public void printHelloWorld() {
        System.out.println("Hello OSGi World!");
    }
}
