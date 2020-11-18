package com.company;

import java.util.Random;

public class Thread2 extends Thread {

    ShareData shareData;

    public Thread2(ShareData shareData) {
        this.shareData = shareData;
    }

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            synchronized (shareData) {
                System.out.println("T2 -> " + i);
                shareData.notifyAll();
                if (i == 19) {
                    System.out.println("Stop 2");
                    stop();
                }
                try {
                    shareData.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                int result = shareData.rd * shareData.rd;
                System.out.println("Thread 2 => " + result);
            }

        }
    }
}
