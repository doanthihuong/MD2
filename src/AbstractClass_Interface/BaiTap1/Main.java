package AbstractClass_Interface.BaiTap1;

public class Main {
    public static void main(String[] args) {
        Shape[] shape = new Shape[3];
        double x = Math.floor(Math.random()*100) ;
        shape[0] = new Circle(4.4);
        shape[1] = new Rectangle(4.2,5.7);
        shape[2] = new Square(6);
        System.out.println("Trước thay đổi ");
        for (Shape shape1 : shape){
            System.out.println(shape1);
        }
//        for (Shape shape1 : shape){
//            shape1.resize(x);
//        }

        System.out.println("Sau thay đổi");
        for (Shape shape11 : shape){
            shape11.resize((x));
            System.out.println(shape11);
        }
    }
}
