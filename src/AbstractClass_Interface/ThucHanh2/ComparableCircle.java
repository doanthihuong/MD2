package AbstractClass_Interface.ThucHanh2;

public class ComparableCircle extends Circle implements Comparable< ComparableCircle>{
    public ComparableCircle() {
    }


    @Override
    public int compareTo(ComparableCircle o) {
        return 0;
    }
}
