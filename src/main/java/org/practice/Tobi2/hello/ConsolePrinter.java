package org.practice.Tobi2.hello;

public class ConsolePrinter implements Printer{
    @Override
    public void print(String message) {
        System.out.println(message);
    }

    @Override
    public void clean() {

    }
}
