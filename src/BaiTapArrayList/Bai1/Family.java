package BaiTapArrayList.Bai1;

import java.util.ArrayList;
import java.util.List;

public class Family {
    List<Person> familyList= new ArrayList<>();
    String Address;
    int soluong;
    public Family() {
        Address="";
        soluong=0;
    }

    public Family(List<Person> fami, String address, int num) {
        this.familyList = fami;
        Address = address;
        this.soluong = num;
    }
//    Thêm thành viên
    public void add (Person per) {
        familyList.add(per);soluong++;

    }
//    Sửa
    public void edit(String name, Person per) {
        int indexOffamily= findByName(name);
        if(indexOffamily ==-1) {
            System.out.print(" Không có");
        } else {
            familyList.set( indexOffamily,per);

        }
    }
//    Tìm
    public  int findByName(String name) {
        for(int i= 0; i<familyList.size();i++) {
            if( familyList.get(i).getName().equals(name));
            return i;
        } return -1;
    }

    public void display() {
        for(int i= 0; i<familyList.size();i++) {
            System.out.println(familyList);
        }
    }
}
