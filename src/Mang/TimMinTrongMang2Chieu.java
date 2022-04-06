package Mang;

import java.util.Scanner;

public class TimMinTrongMang2Chieu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập số hàng");
        int soHang = sc.nextInt();
        System.out.println("nhập số cột");
        int soCot = sc.nextInt();
        int[][] arr = new int[soHang][soCot];
        for (int i = 0; i < soHang; i++) {
            for (int j = 0; j < soCot; j++) {
                System.out.println(" nhập phần tử vị trí [" + i + ", " + j + "]: ");
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < soHang; i++) {
            for (int j = 0; j < soCot; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println(" ");
        }
        int min = arr[0][0];
        for (int i = 0; i < soHang; i++) {
            for (int j = 0; j < soCot; j++) {
                if (min > arr[i][j]) {
                    min = arr[i][j];
                    System.out.println("gia tri nhỏ nhat mang 2 chieu nay la: " + min);
                    break;
                }
            }
        }
    }
}
