package Mang;

import javafx.scene.transform.Scale;

import java.util.Scanner;

public class DaoNguocPtu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" nhập số phần từ của mảng (nhỏ hơn 20 )");
        int SoPtu = sc.nextInt();
        int[] arr = new int[SoPtu];
        for (int i = 0; i < arr.length; i++) {
            System.out.println(" nhập phần tử thứ " + i + " của mảng");
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");
        for (int j = 0; j < arr.length / 2; j++) {
            int temp = arr[j];
            arr[j] = arr[SoPtu - 1 - j];
            arr[SoPtu - 1 - j] = temp;
        }
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
        }
    }
}