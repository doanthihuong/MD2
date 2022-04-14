package QLXe;

public class Oto extends PhuongTien {
    private int Soghe;
    public Oto(){

    }

    public Oto(String hang, String mau, String ten, int gia, int soghe) {
        super(hang, mau, ten, gia);
        Soghe = soghe;
    }


    public int getSoghe() {
        return Soghe;
    }

    public void setSoghe(int soghe) {
        Soghe = soghe;
    }
}
