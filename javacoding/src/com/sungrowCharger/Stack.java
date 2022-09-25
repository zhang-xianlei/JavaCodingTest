package com.sungrowCharger;

class Stack {
    private int pointer = 5;
    private char[] data = new char[5];

    public synchronized void push(char c) {
        while (pointer == data.length) {
            try {
                this.wait();
            } catch (InterruptedException e) {
            }
        }
        this.notify();
        data[pointer] = c;
        pointer++;
    }

    public synchronized char pop() {
        while (pointer == 0) {
            try {
                this.wait();
            } catch (InterruptedException e) {
            }
        }
        this.notify();
        pointer--;
        return data[pointer];
    }
}
