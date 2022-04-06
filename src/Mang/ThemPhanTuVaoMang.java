package Mang;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ThemPhanTuVaoMang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số phần tử: ");
        int n = sc.nextInt();
        int[] mang = new int[n];
        for (int i = 0; i < mang.length; i++) {
            System.out.println(" nhập phần tử thứ " + i + " của mảng");
            mang[i] = sc.nextInt();
        }
        for (int i = 0; i < mang.length; i++) {
            System.out.println(mang[i] + "\t");
        }
        System.out.println("nhập vị trí cần chèn");
        int vitri = sc.nextInt();
        System.out.println(" nhập giá trị chèn");
        int gtri = sc.nextInt();
        int[] mangMoi = new int[n + 1];
        if (vitri == -1 || vitri > mang.length) {
            System.out.println(" không chèn được vào mảng");
        } else {
            for (int i = 0; i < vitri; i++) {
                mangMoi[i] = mang[i];
            }
            mangMoi[vitri] = gtri;
            for (int i = vitri; i < mang.length; i++) {
                mangMoi[i + 1] = mang[i];
            }

            for (int i = 0; i < mangMoi.length; i++) {
                System.out.println(mangMoi[i]);
            }
        }
    }
}
