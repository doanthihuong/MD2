package vongLap;

import java.util.Scanner;

public class Uocchungmax {
    public static void main(String[] args) {
        int a;
        int b;
        int c;
        int ucln = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("nhập a vào !");
        a = sc.nextInt();
        a = Math.abs(a);
        System.out.println("Nhập b vào");
        b = sc.nextInt();
        b = Math.abs(b);
        if (a == 0 && b == 0) {
            System.out.println("không có UCLN");
        } else if (a == 0 || b == 0) {
            if (a == 0) {
                System.out.println(" UClN là:" + b);
            }
            if (b == 0) {
                System.out.println("UCLN là :" + a);
            }
        } else {
            if (a < b) {
                c = a;
            } else {
                c = b;
            }
            for (int i = 1; i <= c; i++) {
                if (a % c == 0 && b % c == 0) {
                    ucln = i;
                }
            }System.out.println("UCLN là:" + ucln);
        }
    }
}

