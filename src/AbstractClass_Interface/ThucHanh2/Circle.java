package AbstractClass_Interface.ThucHanh2;

public class Circle {
    private double Radius ;

    public Circle() {
    }

    public Circle(double radius) {
        Radius = radius;
    }

    public double getradius() {
        return Radius;
    }

    public void setRadius(double radius) {
        Radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "Radius=" + Radius +
                '}';
    }

    public static void main(String[] args) {
        System.out.println( new Circle(1));
    }
}

