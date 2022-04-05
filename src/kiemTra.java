import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class kiemTra {
    public static void main(String[] args) {
        //báo mảng arr, nhập vào n là số phần từ của mảng :
        // nhập n

        Scanner sc=new Scanner(System.in);
        System.out.println( "nhập số phần tử của mảng :");
        int soLuong= sc.nextInt();
        int[]arr= new int[soLuong];
        for(int i =0; i <arr.length;i++) {
            System.out.println( "nhập phần tử thứ " +i + " của mảng");
            arr[i]=sc.nextInt();
        }
        for(int i =0; i <arr.length;i++) {
            System.out.print( arr[i] + " ");
        }
        //in ra các phần tử chẵn trong mảng
        int sum = 0;
        for(int i =0; i <arr.length;i++) {
            if ( arr[i]%2==0) {
                sum=sum+arr[i];
            }
        }
        System.out.println( "tổng các phần tử chẵn: " + sum );
        //Nhập vào a, tìm vị trí a trong mảng
        System.out.println( " Nhập a");
        int a = sc.nextInt();
        for(int i =0; i <arr.length;i++) {
            if (a==arr[i]) {
                int vitri = i;
                System.out.println( " nằm ở vị trí " + vitri + " trong mảng");
                break;
            }
            System.out.println( "không tìm thấy");
            break;

        }
    }

}
