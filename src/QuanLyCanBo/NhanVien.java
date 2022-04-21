package QuanLyCanBo;

public class NhanVien extends CanBo{
    private String CongViec;

    public NhanVien(String congViec) {
        CongViec = congViec;
    }

    public NhanVien(String name, int age, String sex, String address, String congViec) {
        super(name, age, sex, address);
        CongViec = congViec;
    }

    @Override
    public String toString() {
        return "NhanVien{" + super.toString() +
                "CongViec='" + CongViec + '\'' +
                '}';
    }
}
