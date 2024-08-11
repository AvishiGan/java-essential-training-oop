package abstraction.shapes;

public class ShapeTester {

    public static void main(String[] args) {

        //Abstract classes can not be instantiated
        //Shape rectangle = new Shape();

        //Have to use non-abstract subclasses for instantiation
        Shape rectangle = new Rectangle(5,7);
        System.out.println(rectangle.calculateArea());;
    }
}
