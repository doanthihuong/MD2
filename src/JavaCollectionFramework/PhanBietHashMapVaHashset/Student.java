package JavaCollectionFramework.PhanBietHashMapVaHashset;

import java.util.*;

public class Student {
    private String Name;
    private int age;
    private String address;

    public Student() {
    }

    public Student(String name, int age, String address) {
        this.Name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Name='" + Name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Student st1 = new Student("Gia Hân", 18, "Hà Tĩnh");
        Student st2 = new Student("Bảo NGọc", 15, "Cẩm Xuyên");
        Student st3 = new Student("Duy Nghĩa", 19, "Thạch Hà");
        Student st4 = new Student("Thế Nam", 20, "Quảng Bình");
        Map<Integer, Student> studentMap = new HashMap<Integer, Student>();
        studentMap.put(1, st1);
        studentMap.put(2, st2);
        studentMap.put(3, st3);
        studentMap.put(4, st4);


        System.out.println("---------hashMap----------");
        for (Integer key : studentMap.keySet()) {
            System.out.println(studentMap.get(key));
        }
        System.out.println("----------hashset--------");
        Set<Student> studentset = new HashSet<Student>();
        studentset.add(st1);
        studentset.add(st2);
        studentset.add(st3);
        studentset.add(st1);
        studentset.add(st2);
        for (Student student : studentset) {
            System.out.println(student.toString());
        }
    }
}
