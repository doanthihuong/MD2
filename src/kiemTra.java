import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class kiemTra {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("nhập n vào !");
        int n=sc.nextInt();
        int arr[] =new int[n];
        for (int i =0 ; i< n; i++) {
            System.out.println("thêm phân tử thứ " + i + "vào mảng") ;
            arr[i]=sc.nextInt();
        }
        //in ra tổng chẵn
        int sum =0;
        for( int j= 0; j<arr.length; j++) {
            if ( arr[j] % 2 == 0 ) {
                sum = sum+ arr[j];
            }
        } System.out.println ("Tổng các số chẵn :" + sum);
        //    Nhập vào a, tìm vị trí a trong mảng
        System.out.println( " Nhập a vào ");
        int a = sc.nextInt() ;
        for (int k =0;k < arr.length; k++) {
            if (a == arr[k]) {
                int index= k+1;
                System.out.println( a + " có vị trí thứ : " + index +" trong mảng");
                break;
            }  else {
                System.out.println( a+ " không có trong mảng");
            }
        }
    }
    // Nhập a xóa a khỏi mảng


}
