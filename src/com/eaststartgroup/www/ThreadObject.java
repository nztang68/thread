package com.eaststartgroup.www;

public class ThreadObject extends Thread {

    @Override
    public void run() {
        super.run();
        System.out.println("Hello from thread 1!");
        for (int i = 0; i < 20; i++) {
            System.out.println("Count from thread 1 - " + i);
        }
    }
}
