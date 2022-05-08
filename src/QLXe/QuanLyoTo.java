package QLXe;

import javax.naming.ldap.PagedResultsControl;
import java.util.Scanner;

public class QuanLyoTo implements QuanLy<Oto>{
    private Oto []DanhSach= new Oto[3];
     private  int size = 0;

    @Override
    public void them(Oto oto) {
        DanhSach[size]=oto;
        size++;
    }

    @Override
    public void sua(String id, Oto oto) {

    }

    @Override
    public void xoa(String name) {

    }

    @Override
    public int timkiem(String name) {
        for (int i = 0; i < size; i++) {
            if (name == DanhSach[i].getTen()) {

            }

        }
        return -1;
    }
    @Override
    public void sapxep() {

    }

    @Override
    public void print() {
       for (int i=0;i< size;i++) {
           System.out.println( DanhSach[i]);
       }

    }

    public static void main(String[] args) {
        QuanLyoTo ql=new QuanLyoTo();
        Oto ot1=new Oto("toyota","đỏ","madda",50000,8);
        Oto ot2=new Oto("Siêu xe", "đen"," mẹc",100000,10);
//        ql.them(ot1);
//        ql.them(ot2);
//        ql.print();
        ql.timkiem("madda");
        ql.print();
    }
}
