package MiniTest1;

public abstract class Person {
    private int Id;
    private String Name;
    private int Age;

    public Person() {
    }

    public Person(int id, String name, int age) {
        Id = id;
        Name = name;
        Age = age;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "Id=" + Id +
                ", Name='" + Name + '\'' +
                ", Age=" + Age +
                '}';
    }
}
