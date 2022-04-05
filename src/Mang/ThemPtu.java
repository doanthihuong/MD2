package Mang;

public class ThemPtu {
    public static void main(String[] args) {
//        thêm 15 vào phần tử cuối
        int arr[] = {5, 6, 7, 8, 9, 10};
        int arr1[] = new int[7];
        for (int i = 0; i < arr.length; i++) {
            arr1[i] = arr[i];
        }
        arr1[arr1.length - 1] = 15;
//        for (int j : arr1) {
//            System.out.println(j);
//        }
        //thêm 20 vào vị trí số 3
        int arr2[]=new int[7];
        for(int i=0; i<2; i++) {
            arr2[i]=arr[i];

        }arr2[2]=20;
        for (int i=3;i<arr2.length;i++) {
            arr2[i]=arr[i-1];
        }for (int j : arr2) {
            System.out.println(j);
        }

     }
}