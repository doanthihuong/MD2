package Mang;

import java.util.Scanner;

public class GopMang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập số phần tử của mảng 1");
        int soLuong1 = sc.nextInt();
        int[] mang1 = new int[soLuong1];
        for (int i = 0; i < mang1.length; i++) {
            System.out.println(" Nhập phần tử thứ " + i + "của mảng");
            mang1[i] = sc.nextInt();
        }
        for (int i = 0; i < mang1.length; i++) {
            System.out.print(mang1[i] + "\t");
        }

        System.out.println(" Nhập số phần từ của mảng 2");
        int soLuong2 = sc.nextInt();
        int[] mang2 = new int[soLuong2];
        for (int j = 0; j < mang2.length; j++) {
            System.out.println(" Nhập phần tử thứ " + j + "của mảng");
            mang2[j] = sc.nextInt();
        }
        for (int j = 0; j < mang2.length; j++) {
            System.out.print(mang2[j] + "\t");
        }

        int [] mangGop=new int[soLuong1+soLuong2];
        for (int i = 0; i < soLuong1; i++) {
            mangGop[i]=mang1[i];
        }
        for (int i = soLuong1; i < mangGop.length; i++) {
            mangGop[i]=mang2[i-mang2.length];
        }
        for (int i= 0;i<mangGop.length;i++) {
            System.out.print( mangGop[i] + " ");
        }
    }
}
