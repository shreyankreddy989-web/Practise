class Animalone {

    public void sound() {
        System.out.println("Animals make sounds");
    }
}




class Dog extends Animal { // inheritance - oop object oriented programming

    @Override
    public void sound() {
        System.out.println("Dog says Bow Bow");
    }
}

class Cat extends Animal {

    @Override
    public void sound() {
        System.out.println("Cat says Meow Meow");
    }
}

public class Main {

    public static void main(String[] args) {

        Dog d = new Dog();
        Cat c = new Cat();

        d.sound();
        c.sound();
    }
}