package AccessModifier;

import jdk.internal.dynalink.beans.StaticClass;

public class SinhVien {
//    sử dụng phương thức Static Method
    private int Mssv;
    private String name ;
    private String que;
    private static String truong = "HUAF";
    public SinhVien() {
    }

    public SinhVien(int mssv, String name, String que) {
        Mssv = mssv;
        this.name = name;
        this.que = que;
    }

    static void change() {
        truong = " codegym" ;
    }
    void HienThi() {
        System.out.println(Mssv + " " + name + " " + que + " " + truong );
    }

    public static void main(String[] args) {
        SinhVien.change();
        SinhVien s1 =new SinhVien(123,"Hường","Hà tĩnh");
        s1.HienThi();
        SinhVien s2=new SinhVien( 133, "Hoa", "Nghệ An");
        s2.HienThi();
        SinhVien s3=new SinhVien( 154, "Tuệ", "Hà Tĩnh");
        s3.HienThi();
    }

}

