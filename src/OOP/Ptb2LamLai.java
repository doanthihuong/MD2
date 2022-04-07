package OOP;

import java.util.Scanner;

public class Ptb2LamLai {
    private double a, b, c;

    public Ptb2LamLai(double a, double b, double c) {
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

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getdetal() {
        return b * b - 4 * a * c;
    }

    public double getX1() {
        return (-b - Math.pow(getdetal(), 0.5)) / 2 * b;
    }

    public double getX2() {
        return (-b + Math.pow(getdetal(), 0.5)) / 2 * a;
    }

    public void ketqua() {
        if (getdetal() == 0) {
            System.out.println(" Giải phương trình bậc nhất ");
        } else if (getdetal() > 0) {
            System.out.println(" Nghiệm 1 :" + getX1() + "và nghiệm 2 " + getX2());
        } else {
            System.out.println(" Vô nghiệm");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PhuongTrinhBacHai pt2 = new PhuongTrinhBacHai(1, 2, 3);
        pt2.KetQua();
    }
}
