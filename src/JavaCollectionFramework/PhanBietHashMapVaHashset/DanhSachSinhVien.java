package JavaCollectionFramework.PhanBietHashMapVaHashset;

import QLSVArray.Student;

import java.util.*;

public class DanhSachSinhVien {
    public static void main(String[] args) {
//        Tạo HashMap trong main để lưu danh sách sinh viên?
        Map<String,Integer> studentList = new HashMap<>();
        studentList.put("Hường ", 20);
        studentList.put("Lan Anh",19);
        studentList.put("Thanh Hoa", 22);
        studentList.put("Thùy Linh", 22);
        studentList.put("An",25);
        System.out.println(" hiển thị danh sách sinh viên");
        System.out.println(studentList + "\n");
        //    Tạo TreeMap trong main để lưu key theo thứ tự giảm dần
        Map<String, Integer> danhSachGiamDan = new TreeMap<>(studentList);
        System.out.println("Danh sách sinh viên theo thứ tự giảm dần");
        System.out.println(danhSachGiamDan);
        Map<String,Integer> linkedDanhSach=new LinkedHashMap<>(10,0.70f,true);
        linkedDanhSach.put("Hoa", 30);
        linkedDanhSach.put( "Hưng",28);
        linkedDanhSach.put( "Sơn", 40);
        System.out.println( " Tuổi của Hoa là " + linkedDanhSach.get("Hoa"));
    }


}
