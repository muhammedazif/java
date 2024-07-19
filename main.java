class Animal {
    void eat() {
        System.out.println("Animal eats.");
    }
}

class Dog extends Animal {
    void eat() {
        super.eat(); // Calls the superclass method
        System.out.println("Dog eats.");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.eat(); // Outputs: Animal eats. Dog eats.
    }
}
