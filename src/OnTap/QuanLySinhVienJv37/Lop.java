package OnTap.QuanLySinhVienJv37;

public class Lop {
    private String lopHoc;
    private String Khoa;

    public Lop() {
    }

    public Lop(String lopHoc, String khoa) {
        this.lopHoc = lopHoc;
        Khoa = khoa;
    }

    public String getLopHoc() {
        return lopHoc;
    }

    public void setLopHoc(String lopHoc) {
        this.lopHoc = lopHoc;
    }

    public String getKhoa() {
        return Khoa;
    }

    public void setKhoa(String khoa) {
        Khoa = khoa;
    }
}
