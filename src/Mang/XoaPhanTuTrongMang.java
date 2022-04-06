package Mang;

import java.util.Scanner;

public class XoaPhanTuTrongMang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Nhập số phần tử của mảng");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int viTri = -1;

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Nhập vị trí của " + i + "của mảng");
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println(" nhập giá trị a");
        int a = sc.nextInt();
        for (int j = 0; j < arr.length; j++) {
            if (a == arr[j]) {
                viTri = j;
                System.out.println("a nằm ở vị trí " + viTri + " của mảng");
                break;
            }
        }
        if (viTri == -1) {
            System.out.println("không tìm thấy");
        } else {
            int[] mangMoi = new int[n - 1];
            for (int i = 0; i < viTri; i++) {
                mangMoi[i] = arr[i];
            }
            for (int i = viTri; i < mangMoi.length; i++) {
                mangMoi[i] = arr[i + 1];
            }
            for (int i = 0; i < arr.length - 1; i++) {
                System.out.print(mangMoi[i] + "\t");
            }
        }

    }
}
