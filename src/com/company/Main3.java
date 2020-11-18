package com.company;

public class Main3 {
    public static void main(String[] args) {
        ShareData shareData = new ShareData();

        Thread1 t1 = new Thread1(shareData);
        Thread2 t2 = new Thread2(shareData);

        t1.start();
        t2.start();
    }
}
