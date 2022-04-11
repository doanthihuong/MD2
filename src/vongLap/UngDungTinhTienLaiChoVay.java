package vongLap;

import javafx.scene.transform.Scale;

import java.util.Scanner;
// Lãi suất giả định

public class UngDungTinhTienLaiChoVay {
    public static void main(String[] args) {
        int thang;
        double Tien;
        double Tiennhanduoc=0;
        Scanner sc = new Scanner(System.in);
        System.out.println(" Nhập tiền gửi : ");
        Tien = sc.nextDouble();
        System.out.println(" nhập tháng : ");
        thang = sc.nextInt();
        if (thang <= 3) {
            Tiennhanduoc = Tiennhanduoc + (Tien * (3.5 / 100) / 12 * thang);
            System.out.println(" Tiền nhận được " + Tiennhanduoc);
        } else if (3 < thang && thang < 6) {
            Tiennhanduoc = Tiennhanduoc +(Tien * (5.5 / 100) /12 * thang);
            System.out.println(" Tiền nhận được " + Tiennhanduoc);

        } else
            Tiennhanduoc = Tiennhanduoc +(Tien * (6.5 / 100) / 12 * thang);
        System.out.println(" Tiền nhận được " + Tiennhanduoc);

    }
}
