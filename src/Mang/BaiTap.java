package Mang;

public class BaiTap {
    public static void main(String[] args) {
        int[] arr ={5,6,7,8,9,10};
        // xóa
        for(int i=2;i<arr.length-1;i++) {
            arr[i]=arr[i+1];
        }
//        xóa phần tử thứ 2 bằng cách tạo mảng mới
        int[]arr1=new int[5];
        for( int i=0;i<2;i++) {
            arr1[i]=arr[i];
        }
        for(int i =2;i<arr1.length;i++) {
            arr1[i]=arr[i+1];
        }
//        thêm
        arr[arr.length-1]=15;

        for (int j : arr1) {
            System.out.println(j);
        }

    }
}
