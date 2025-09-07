class Calculator {
    // Method Overloading (Compile-time polymorphism)
    int add(int a, int b) { return a + b; }
    double add(double a, double b) { return a + b; }
}

class Animal {
    void sound() { System.out.println("Animal makes sound"); }
}

class Cat extends Animal {
    @Override
    void sound() { System.out.println("Meow..."); }
}

public class Polymorphism {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println(c.add(5, 10));
        System.out.println(c.add(2.5, 3.5));

        Animal a = new Cat(); // Run-time polymorphism
        a.sound();
    }
}
