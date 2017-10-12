package com.eaststartgroup.www;

public class Main {

    public static void main(String[] args) throws InterruptedException {
	// write your code here
        Thread thread1 = new ThreadObject();
        Thread thread2 = new Thread(new ThreadAltObject());

        thread1.start();
        thread2.start();
    }
}
