package QuanLySach;

public class TapChi extends TaiLieu{
    private  int sophathanh;
    private int thangphathanh;

    public TapChi() {
    }

    public TapChi(int sophathanh, int thangphathanh) {
        this.sophathanh = sophathanh;
        this.thangphathanh = thangphathanh;
    }

    public int getSophathanh() {
        return sophathanh;
    }

    public void setSophathanh(int sophathanh) {
        this.sophathanh = sophathanh;
    }

    public int getThangphathanh() {
        return thangphathanh;
    }

    public void setThangphathanh(int thangphathanh) {
        this.thangphathanh = thangphathanh;
    }

    @Override
    public String toString() {
        return super.toString()+ "TapChi{" +
                "sophathanh=" + sophathanh +
                ", thangphathanh=" + thangphathanh +
                '}';
    }
}
