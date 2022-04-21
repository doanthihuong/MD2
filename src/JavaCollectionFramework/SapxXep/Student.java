package JavaCollectionFramework.SapxXep;

public class Student implements Comparable<Student> { // Đấy nhé chị đang so sáng các học sinh thì implement vào class học sinh
    String name;
    int Age;
    String Address;

    public Student() {
    }

    public Student(String name, int age, String address) {
        this.name = name;
        this.Age = age;
        this.Address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", Age=" + Age +
                ", Address='" + Address + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student student) {
        if (this.getName().compareTo(student.getName()) == 0) {
            return Integer.compare(this.getAge(), student.getAge());
        }
        return this.getName().compareTo(student.getName());
    }

}
