package KeThua;

import AccessModifier.HinhTron;

public class Shape { String Color ;
    boolean filled;
    public Shape() {
        Color= "green";
        filled =true;
    }
    public Shape(String color, boolean filled) {
        Color = color;
        this.filled = filled;
    }

    public String getColor() {
        return Color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setColor(String color) {
        Color = color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "Shape {" +
                "Color='" + Color + '\'' +
                ", filled=" + filled +
                '}';
    }

    public static void main(String[] args) {
        System.out.println( new Shape());
        Shape HinhTron =new Shape( " xanh lá cây", false);
        System.out.println(HinhTron.toString());
        Shape HinhChuNhat= new Shape( " da cam " , true);
        System.out.println(HinhChuNhat.toString());
    }
}

class Circle extends Shape {
    double radius;

    public Circle() {

        radius = 1.0;
    }

    public double getRadius() {

        return radius;
    }
    public void setRadius(double radius) {

        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getDienTich() {
        return Math.PI*radius*radius;
    }
    public double getChuVi(){
        return  Math.PI*2*radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "Color='" + Color + '\'' +
                ", filled=" + filled +
                ", radius=" + radius +
                '}';
    }

    public static void main(String[] args) {
        System.out.println(new Circle());
        Circle circle1= new Circle( "xanh", false, 3.0 );
        System.out.println( circle1.toString());
        System.out.println( "Diện tích : " + circle1.getDienTich() + " , chu vi: "+ circle1.getChuVi());

    }
}
