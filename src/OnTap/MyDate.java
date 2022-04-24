package OnTap;

public class MyDate {
//     Tạo ra một class : ngày tháng Date;
//    Trong Date có các dữ liệu : ngày, tháng,năm .
//    in ra ngày
//    in ra tháng
//    in ra năm
//    in ra ngày, tháng, năm.
private int day;
private  int month;
private  int year;
 public MyDate(int d, int m, int y) {
     this.day =d;
     this.month =m;
     this. year = y;
 }
    public void printDay() {
        System.out.println( " day : " + this.day);
    }
    public void printMonth () {
        System.out.println("month: " + this.month);
    }
    public  void printYear() {
        System.out.println("year : " + this.year);
    }
    public void printDate() {
        System.out.println(" Date : " + this.day + " - " + this.month + " - " + this.year);
    }

    public static void main(String[] args) {
        int d;
        MyDate md= new MyDate(26,1,1994);
        md.printDay();
        md.printMonth();
        md.printYear();
        md.printDate();
    }

}
