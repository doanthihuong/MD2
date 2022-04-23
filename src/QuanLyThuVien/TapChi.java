package QuanLyThuVien;

public class TapChi extends TaiLieu {
    private int thangsPhatHanh;

    public TapChi() {
    }

    public TapChi(String nxb, int sophathanh, int thangsPhatHanh) {
        super(nxb, sophathanh);
        this.thangsPhatHanh = thangsPhatHanh;
    }

    public int getThangsPhatHanh() {
        return thangsPhatHanh;
    }

    public void setThangsPhatHanh(int thangsPhatHanh) {
        this.thangsPhatHanh = thangsPhatHanh;
    }

    @Override
    public String toString() {
        return super.toString()+ "Tạp chí: " + "," + "tháng phát hành: " + thangsPhatHanh;
    }
    public static void main(String[] args) {
        TapChi tapChi=new TapChi("Kim đồng", 100,12);
        TapChi tapChi1=new TapChi("Kim đồng", 200,2);
        TapChi tapChi2=new TapChi("TiKi", 150,4);
        System.out.println(tapChi);
        System.out.println(tapChi1);
        System.out.println(tapChi2);
    }
}
