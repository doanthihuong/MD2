package AbstractClass_Interface.ThucHanh1;

public class Chicken extends Animal implements Edible {


    @Override
    public void howtoEat() {
        System.out.println( " nướng ! ");
    }

    @Override
    public String makeSound() {
        return " ò ó o";
    }
}
