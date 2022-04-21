package JavaCollectionFramework.SapxXep;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Student st = new Student("Hường", 18, "HT");
        Student st1 = new Student("Mai", 26, "HN");
        Student st2 = new Student("Như", 20, "HT" );
        Student st3 = new Student("An", 20, "HT" );

        List<Student> liststudent = new ArrayList<>();
        liststudent.add(st);
        liststudent.add(st1);
        liststudent.add(st2);
        liststudent.add(st3);
        Collections.sort(liststudent);
        for(Student hs : liststudent){
            System.out.println(hs.toString());
        }

        //Student.com ageComparator = new Student.SStuoi(); chạy thử đi hình như chưa được em ơi!
//        theo tuổi mà sao
        Collections.sort(liststudent);
        System.out.println("So sanh theo tuoi:");
        for(Student hs : liststudent){
            System.out.println(hs.toString());
        }
    }
}
