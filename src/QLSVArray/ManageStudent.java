package QLSVArray;

import java.util.ArrayList;
import java.util.List;

public class ManageStudent {
    List<Student> students= new ArrayList<>();

    public ManageStudent() {
        this.students = students;
    }
//    thêm
    public void add(Student student) {
        students.add(student);
    }
//    tìm kiếm
    public int findByName(String name) {
        for(int i = 0; i< students.size();i++) {
            if( students.get(i).getName().equals(name))
                return i;
        }  return -1;

    }
//    Sửa
      public  void edit (String name, Student student) {
        int indexOfStudent = findByName(name);
        if(indexOfStudent ==-1) {
            System.out.println( " không  có");
        }
        else {
            students.set(indexOfStudent,student);
        }
      }
//      Xóa
    public void  delete(String name) {
        int indexOfStudent = findByName(name);
        if( indexOfStudent ==-1) {
            System.out.println( " Không có");
        }
        else {
            students.remove(indexOfStudent);
        }
    }
    public void display () {
        for (int i=0;i<students.size();i++) {
            System.out.println(students.get(i).toString());
            System.out.println( "-----------------=");
        }
    }


}
