package vongLap;

import java.util.Scanner;

public class KiemtraSnt {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("nhập số a");
        int num = sc.nextInt();
        if (num<2) {
            System.out.println(num +"không phải số nguyên tố");
        } else {
            int i=2;
            boolean check=true;
            while (i<num) {
                if ( num%i==0) {
                    check = false;
                    break;
                }
                i++;
            }
            if (check)
                System.out.println(num + "là số nguyên tố");
            else
                System.out.println( num + " không là số nguyên tố ");

        }
    }

}
