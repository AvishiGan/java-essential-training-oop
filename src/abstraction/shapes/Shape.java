package abstraction.shapes;

public abstract class Shape {

    //Non access modifier
    abstract double calculateArea();

    //Abstract class can have non-abstract methods as well
    public static void print() {
        System.out.println("I am a shape");
    }
}
