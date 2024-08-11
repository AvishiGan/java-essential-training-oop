package interfaces;

public interface Product {

    //Field in an interface should be static and final
    //Better to omit the fields altogether
    //private String name;

    String getName();

    void setName(String name);

    //Gives default method implementation
    //Can be overridden by subclasses
    default double getPrice() {
        return 50;
    }

    default void setPrice(double price) {
    }
}
