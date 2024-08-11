package polymorphism;

public class Zoo {

    public static void main(String[] args) {

        Dog rocky = new Dog();
        rocky.fetch();
        rocky.makeSound();
        feed(rocky);

        //Type of Animal but an instance of Dog
        Animal sasha = new Dog();
        sasha.makeSound();

        //Polymorphism
        sasha = new Cat();
        sasha.makeSound();
        feed(sasha);

        //Down cast
        ((Cat) sasha).scratch();
    }


    public static void feed(Animal animal) {

        if (animal instanceof Dog) {
            System.out.println("Here is your dog food");
        } else if (animal instanceof Cat) {
            System.out.println("Here is your cat food");
        }

    }
}
