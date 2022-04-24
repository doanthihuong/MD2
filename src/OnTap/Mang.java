package OnTap;

import javax.jws.Oneway;
import java.util.Scanner;

public class Mang {
    //tính tổng các số giá trị trong mảng
    public static void main(String[] args) {
        double [] arr;
        double arr2 [];
        arr =new double[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(" nhập phần tử thứ " + i + " : ");
            arr[i]= sc.nextDouble();

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print( arr[i] + " ");

        }
        double tong =0 ;
        for (int i = 0; i < arr.length; i++) {
            tong +=arr[i];
        }
        System.out.println( " Tổng = : " +tong );
        System.out.println( "__________mảng 2_____________-");
         arr2 =new double[] { 1,3,4,7,9,0};
        for (int i = 0; i <arr2.length ; i++) {
            System.out.print(arr2[i] + " ");

        }
    }
}
