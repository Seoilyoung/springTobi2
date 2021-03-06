package org.practice.Tobi2.hello;

public class StringPrinter implements Printer{
    private StringBuffer buffer = new StringBuffer();

    @Override
    public void print(String message) {
        this.buffer.append(message);
    }

    public String toString(){
        return this.buffer.toString();
    }

    public void clean(){
        this.buffer.setLength(0);
    }
}
