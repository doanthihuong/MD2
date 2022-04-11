package AccessModifier;

public class Student2 {
    private String name = "Hường";
    private String Classes = " C0222H1";

    public Student2() {
    }

    public Student2(String name, String Classes) {
        this.name = name;
        this.Classes = Classes;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setClasses(String classes) {
        this.Classes = classes;
    }

    public String getClasses() {
        return Classes;
    }

    void HienThi() {
        System.out.println(name + " học lớp " + Classes);
    }
    public static void main(String[] args) {
        Student2 sv = new Student2(" tôi ", "Codegym");
        Student2 sv2= new Student2();
        sv.HienThi();
        sv2.HienThi();

    }
}
