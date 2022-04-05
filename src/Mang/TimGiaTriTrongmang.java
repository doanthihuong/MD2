package Mang;

import java.util.Scanner;

public class TimGiaTriTrongmang {
    public static void main(String[] args) {
        String [] students= {"An","Mai","Lan","Mi","Sơn","Hoa","Thúy","Nga"};
        Scanner sc= new Scanner(System.in);
        System.out.println( " Hãy nhập tên vào !");
        String name = sc.nextLine();
        boolean check =true;
        for (int i=0;i< students.length;i++) {
            if (students[i].equals(name)) {
                System.out.println( "tên " + name + " ở vị trí " + i + " trong mảng");
                check=true;
                break;
            }
            if(!check) {
                System.out.println(" không tìm thấy trong mảng");
                break;
            }
        }


    }
}
