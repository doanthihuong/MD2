package QuanLyThuVien;

public class TaiLieu {
    private static int autoId;
    private int ma;
    private String nxb;
    private int sophathanh;

    public TaiLieu() {
    }

    public TaiLieu( String nxb, int sophathanh) {
        this.ma = autoId;
        autoId++;
        this.nxb = nxb;
        this.sophathanh = sophathanh;
    }

    public static int getAutoId() {
        return autoId;
    }

    public static void setAutoId(int autoId) {
        TaiLieu.autoId = autoId;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getNxb() {
        return nxb;
    }

    public void setNxb(String nxb) {
        this.nxb = nxb;
    }

    public int getSophathanh() {
        return sophathanh;
    }

    public void setSophathanh(int sophathanh) {
        this.sophathanh = sophathanh;
    }

    @Override
    public String toString() {
        return  "mã: " + ma +", " + "nhà xuất bản: "+nxb +", " + "số Phát hành: "+sophathanh;
    }

//    public static void main(String[] args) {
//        TaiLieu taiLieu =new TaiLieu( "KĐ", 100);
//        TaiLieu tailieu1 = new TaiLieu( "TK",130);
//        System.out.println(taiLieu);
//        System.out.println(tailieu1);
//    }
}

