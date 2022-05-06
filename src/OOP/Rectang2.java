package OOP;

public class Rectang2 {
    double dai ;
    double rong;

    public Rectang2() {
    }

    public Rectang2(double dai, double rong) {
        this.dai = dai;
        this.rong = rong;
    }
    public double getChuVi(){
        return (dai+rong)*2;
    }
    public double getDienTich(){
        return dai*rong;
    }
    public void hienThi(){
        System.out.println("Hình chữ nhật có diện tích : " +getDienTich()+ ", chu vi: " + getChuVi());
    }
    public static void main(String[] args) {
        Rectang2 rectang =new Rectang2(10,5);
        rectang.hienThi();
    }
}
