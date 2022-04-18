package QLSVArray;

public class main<student> {
    public static void main(String[] args) {
        ManageStudent ql = new ManageStudent();
        Student st1 = new Student(123, "An Nhiên", 27);
        Student st2 = new Student(136, "Mai Anh", 20);
//        Student st3 = new Student(150, "Gia Hân", 22);
//        Student st4 = new Student(153, "Tùng Chi", 28);
        ql.add(st1);
        ql.add(st2);
//        ql.add(st3);
//        ql.add(st4);
//        ql.display();
//        System.out.println(ql.findByname("Tùng Chi"));
//        ql.edit("An Nhiên", new Student(125, "Nhật Ánh",20));
//        ql.display();

        ql.delete("Mai Anh");
        ql.display();
    }
}
