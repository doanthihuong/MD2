package MiniTest1;

public class Students extends Person{
    private double scores;

    public Students() {
    }

    public Students(double scores) {
        this.scores = scores;
    }

    public Students(int id, String name, int age, double scores) {
        super(id, name, age);
        this.scores = scores;
    }

    public double getScores() {
        return scores;
    }

    public void setScores(double scores) {
        this.scores = scores;
    }

    @Override
    public String toString() {
        return "Students{" +getId()+
               "Tên" + getName()+
                "Tuổi =" + getAge()+
                "Scores=" + getScores() +
                '}';
    }

    public static void main(String[] args) {
        Students st =new Students ();
        Students st1= new Students( 12345 ,  " Hường ",  18 , 100 );
        Students st2=new Students( 1324, " Như Anh ", 20, 90);
        System.out.println(st1.toString());
        System.out.println(st2.toString());

    }
}
