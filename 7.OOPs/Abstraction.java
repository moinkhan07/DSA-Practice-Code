public class Abstraction {
    public static void main(String[] args) {
        // Animal a1 = new Animal(); //  Cannot instantiate the type Animal

        Chicken ch1 = new Chicken();
        ch1.eat();
        ch1.walks();

        Cat c1 = new Cat();
        c1.eat();
        c1.walks();
    }
}

abstract class Animal{ // Cannot create instance of Abstract class.

    void eat(){ // Abstract class can contained non-abstract method also.
        System.out.println("Eating...");
    }
    abstract void walks();
}

class Cat extends Animal{

    @Override
    void walks() {
        System.out.println("Cat walks on 4 legs.");
    }

}

class Chicken extends Animal{

    @Override
    void walks() {
        System.out.println("Chicken walks on 2 legs.");
    }
}

