package QuanLySach;

public class Bao extends TaiLieu{
    private String ngayphathanh;

    public Bao() {
    }

    public Bao(String ngayphathanh) {
        this.ngayphathanh = ngayphathanh;
    }

    public String getNgayphathanh() {
        return ngayphathanh;
    }

    public void setNgayphathanh(String ngayphathanh) {
        this.ngayphathanh = ngayphathanh;
    }

    @Override
    public String toString() {
        return super.toString() +
                "BaoCao{" +
                "ngayphathanh='" + ngayphathanh + '\'' +
                '}';
    }
}
