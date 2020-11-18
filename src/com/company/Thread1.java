package com.company;

import java.util.Random;

public class Thread1 extends Thread {

    ShareData shareData;

    public Thread1(ShareData shareData) {
        this.shareData = shareData;
    }

    @Override
    public void run() {
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            synchronized (shareData) {
                System.out.println("T1 -> " + i);
                int rd = random.nextInt(5);
                shareData.rd = rd;
                System.out.println("Thread 1 => " + rd);

                shareData.notifyAll();
                if (i == 19) {
                    System.out.println("Stop 1");
                    stop();
                }

                try {
                    shareData.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
