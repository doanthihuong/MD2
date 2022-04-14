//package QLXe;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class QuanLyXeMay implements QuanLy {
//    private List<XeMay> Danhsach = new ArrayList<>();
//
//    @Override
//    public void them(Oto Oto) {
//
//    }
//
//    @Override
//    public void them(Object o) {
//        Danhsach.add((XeMay) o);
//    }
//    @Override
//    public void sua(String id, Object o) {
//    }
//    @Override
//    public void xoa(String name) {
//        for (int i = 0; i< Danhsach.size();){
//            if(Danhsach.get(i).getTen().equals(name)){
//                Danhsach.remove(Danhsach.get(i));
//            }
//            else{
//                i++;
//            }
//        }
//    }
//
//    @Override
//    public XeMay timkiem(String name) {
//        return null;
//    }
//
//    @Override
//    public void sapxep() {
//
//    }
//
//    @Override
//    public void print() {
//        for (XeMay x : Danhsach){
//            System.out.println(String.valueOf(x));
//        }
//    }
//
//    @Override
//    public String toString() {
//        return "QuanLyXeMay{" +
//                "Danhsach=" + Danhsach +
//                '}';
//    }
//
//    public static void main(String[] args) {
//        QuanLyXeMay ql = new QuanLyXeMay();
//        XeMay xm1 = new XeMay("yamaha", "đen", "grande", 25000, 100);
//        XeMay xm2 = new XeMay("yamaha", "trang", "SH", 30000, 950);
//        ql.them(xm1);
//        ql.them(xm1);
//        ql.them(xm2);
//        ql.print();
//        ql.xoa("grande");
//        System.out.println("Sau khi xóa ");
//        ql.print();
//
//    }
//}
