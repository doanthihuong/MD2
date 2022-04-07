package OOP;

import java.util.Scanner;

public class HinhChuNhat {
    double ChieuDai, ChieuRong;

    public HinhChuNhat(double chieuDai, double chieuRong) {
        ChieuDai = chieuDai;
        ChieuRong = chieuRong;
    }
    public static double DienTich (double ChieuDai, double ChieuRong){
        return ChieuDai*ChieuRong;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner( System.in);
        System.out.println(" nhập chiều dài");
        double ChieuDai= sc.nextDouble();
        System.out.println( " nhập chiều rộng");
        double ChieuRong= sc.nextDouble();
        System.out.println("Dien tich la: " +DienTich ((double) ChieuDai, (double) ChieuRong));
    }

    }
