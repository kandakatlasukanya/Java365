
class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}

class Cat extends Animal {
    void meow() {
        System.out.println("Cat is meowing");
    }
}

public class Nov14 {
    public static void main(String[] args) {

        Animal a1 = new Dog();
        Animal a2 = new Cat();

        // Runtime type checking using instanceof

        System.out.println(a1 instanceof Animal);
        System.out.println(a1 instanceof Dog);
        System.out.println(a1 instanceof Cat);

        System.out.println(a2 instanceof Animal);
        System.out.println(a2 instanceof Cat);
        System.out.println(a2 instanceof Dog);

        // Using instanceof with if condition

        if (a1 instanceof Dog) {
            Dog d = (Dog) a1;
            d.bark();
        }

        if (a2 instanceof Cat) {
            Cat c = (Cat) a2;
            c.meow();
        }
    }
}
