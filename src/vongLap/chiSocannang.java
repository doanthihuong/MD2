package vongLap;

import java.util.Scanner;

public class chiSocannang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double cannang, chieucao, bmi;
        System.out.println("nhập cân nặng !");
        cannang = sc.nextDouble();
        System.out.println("nhập chiều cao vào đê!");
        chieucao = sc.nextDouble();
        bmi = cannang/Math.pow(chieucao,2);

        if (bmi < 18) {
            System.out.println(bmi + " gầy quá, ăn nhiêu vao");
        }
        else if (bmi < 25) {
                System.out.println(bmi + " ổn ");
        }
        else if (bmi < 30) {
                System.out.println(bmi + "quá cân zồi");
        }
        else if (bmi>=30 ) {
            System.out.println( bmi + " Béo phì rồiiii");
        }
    }
    }