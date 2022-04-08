package AccessModifier;

public class Car {
    private String name;
    private String brand;
    public static int Stt ;

    public Car(String name, String brand) {
        Stt++;
        this.name = name;

        this.brand = brand;
    }
    void  HienThi () {
        System.out.println( Stt + " : " + name + " đi xe " + brand );

    }

    public static void main(String[] args) {
        Car car1 =new Car( "Hường", " mercerdes");
        car1.HienThi();

        Car car2= new Car( "Như Anh", " xe ben");
        car2.HienThi();
        Car car3= new Car( "Hoa" , "đạp");
        car3.HienThi();
    }
}
