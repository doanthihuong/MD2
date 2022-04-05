package Mang;

import javafx.scene.transform.Scale;

import java.util.Scanner;

public class TimGtriMax {
    public static void main(String[] args) {
        Scanner sc =new Scanner( System.in);
        System.out.println( " Nhập sô lượng tỉ phú < 20 :" );
        int soLuong = sc.nextInt();
        int [] arr= new int[soLuong];
        for (int i =0; i<arr.length; i++) {
            System.out.println( " Nhập tài sản của tí phú thứ " + i + " :");
            arr[i]= sc.nextInt();
        }  for (int i =0; i<arr.length; i++) {
            System.out.print( arr[i] + " ");
        }
        int max = arr [0];
        int vitri=1;
        for (int j =0; j<arr.length; j++) {
            if (arr[j]>max) {
                max=arr[j];
                vitri=vitri+1;
            }
        }
        System.out.println( "tỉ phú có số tài sản lớn nhất là : " + max + " tỷ đô la ở vị trí :"  + vitri );
    }
}
