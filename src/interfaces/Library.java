package interfaces;

public class Library {

    public static void main(String[] args) {

        //Just like abstract classes, interfaces also can not be instantiated
        //Product book = new Product();

        Product book = new Book();
        book.setName("In the Kitchen with H+ Sport");

        Book book2 = new Book();
        book2.getPrice();
    }
}
