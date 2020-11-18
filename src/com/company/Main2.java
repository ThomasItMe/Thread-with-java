package com.company;

public class Main2 {
    public static void main(String[] args) {
        ShareData shareData = new ShareData();

        CustomThread t1 = new CustomThread(shareData);
        t1.start();
        CustomThread t2 = new CustomThread(shareData);
        t2.start();
        CustomThread t3 = new CustomThread(shareData);
        t3.start();
        CustomThread t4 = new CustomThread(shareData);
        t4.start();
        CustomThread t5 = new CustomThread(shareData);
        t5.start();
    }
}
