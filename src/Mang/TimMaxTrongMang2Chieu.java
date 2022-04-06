package Mang;

import java.util.Scanner;

public class TimMaxTrongMang2Chieu {
    public static void main(String[] args) {

//      cho Sẵn
//        int [][] arr = {
//                {1,3,4,6},
//                {2,0,3,7},
//                {3,2,4,1}
//        };

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
        int max = arr[0][0];
        for (int i = 0; i < soHang; i++) {
            for (int j = 0; j < soCot; j++) {
                if (max < arr[i][j]) {
                    max = arr[i][j];
                }
            }
        }

                System.out.println("gia tri lon nhat mang 2 chieu nay la: " + max);

    }
}
