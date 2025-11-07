// abstract class implementation

// interface only gives the blueprint... it only lets u make function prototypes and declare variables which are public static and final(constants)
// but abstract class lets u prototype as well as implement functions if u want to.


abstract class Animal{
    //all animals eat food
    public void eat(){
        System.out.println("This animal eats food to stay alive");
    }

    //but all animals make different sounds, so u don't give its functionality
    abstract public void sound();
}


class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Dog barks.");
    }
}

class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("Cat meows.");
    }
}

public class AbsClassMain {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();

        dog.eat();   // from abstract class
        dog.sound(); // from child class

        cat.eat();
        cat.sound();
    }
}
