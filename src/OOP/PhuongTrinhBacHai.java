package OOP;

import java.util.Scanner;

public class PhuongTrinhBacHai {
    private double a, b, c;

    public PhuongTrinhBacHai(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }


    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getDeltal() {
        return (b * b - 4 * a * c);
    }

    public double getX1() {
        return (-b - Math.pow(getDeltal(), 0.5))/2*a;

    }
    public double getX2() {
        return (-b + Math.pow(getDeltal(), 0.5))/2*a;

    }
    public void KetQua () {
        if ( getDeltal()==0) {
            System.out.println(" pt có 1 nghiệm " +  -b/2*a);
        } else if ( getDeltal()>0) {
            System.out.println( "nghiệm 1: " + getX1() + "nghiệm 2: " + getX2());
        } else  {
            System.out.println("vô nghiệm");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" nhập a :");
        double a = sc.nextDouble();
        System.out.println(" nhập b");
        double b = sc.nextDouble();
        System.out.println(" nhập c");
        double c = sc.nextDouble();
        PhuongTrinhBacHai ptb2= new PhuongTrinhBacHai( a,b,c);
        ptb2.KetQua();
    }


}
