package Mang;

import javafx.scene.transform.Scale;

import java.util.Scanner;

public class DaoNguocPtu {
//    làm Lại
public static void main(String[] args) {
    Scanner sc= new Scanner( System.in);
    System.out.println( " nhập số phần tử nhỏ hơn 20 : ");
    int SoPthu=sc.nextInt();
    int [] arr =new int[SoPthu];
    for(int i=0;i<SoPthu;i++) {
        int index = i+1;
        System.out.println( "Nhập phần tử thứ : " + index );
        arr[i]= sc.nextInt();
    }
    for(int i=0;i<SoPthu;i++) {
        System.out.print( arr[i] + " ");
    }
    for( int j= SoPthu;j>0;j--)

}
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println(" nhập số phần từ của mảng (nhỏ hơn 20 )");
//        int SoPtu = sc.nextInt();
//        int[] arr = new int[SoPtu];
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(" nhập phần tử thứ " + i + " của mảng");
//            arr[i] = sc.nextInt();
//        }
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println(" ");
//        for (int j = 0; j < arr.length / 2; j++) {
//            int temp = arr[j];
//            arr[j] = arr[SoPtu - 1 - j];
//            arr[SoPtu - 1 - j] = temp;
//        }
//        for (int j = 0; j < arr.length; j++) {
//            System.out.print(arr[j] + " ");
//        }
//    }
}