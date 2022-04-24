package OnTap;

public class TestMyDate2 {
    public static void main(String[] args) {
        MyDate2 md =new MyDate2( 20,3,1994 );
        MyDate2 md1=new  MyDate2( 26,1,1994);
        MyDate2 md2=new  MyDate2( 20,3,1994);

//        System.out.println(md.toString());
//        System.out.println(md1.toString());
        System.out.println(" md so sánh bằng với md2: " + md.equals(md2));
        System.out.println( "md so sánh bằng với md1: " + md.equals(md1));
        System.out.println( "Hashcode md1 " + md.hashCode()) ;
        System.out.println( "Hashcode md2 " + md1.hashCode()) ;
        System.out.println( "Hashcode md3 " + md2.hashCode()) ;

    }
}
