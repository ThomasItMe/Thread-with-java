package com.company;

public class ShareData {
    public int x = 0;
    public int rd = 0;

    public synchronized void add(int plus) {
        x += plus;
        System.out.println("\n day so: " + x);
        for (int i = 0; i < x; i++) {
            System.out.print(" " + i );
        }
    }
}
