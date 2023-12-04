public class Inheritance {

    public static void main(String[] args) {
        Cat c1 = new Cat();
        c1.color = "Black";
        c1.eyeColor = "Brown and white";
        c1.breed = "Persian";
        c1.getCatDetails();
        c1.eats();
        c1.walks();

        kitten k1 = new kitten();
        k1.breed = "Birman";
        k1.color = "white and grey";
        k1.eyeColor = "green and black";
        k1.weight = 1;
        k1.getKittenDetails();
        k1.eats();
        k1.walks();
        k1.sounds();

        Fish f1 = new Fish();
        f1.color = "Yellow";
        f1.fins = 5;
        f1.breed = "Pacific";
        f1.getFishDetails();
        f1.swims();

    }
    
}

class Animal{
    String color;
    String breed;

    Animal(){
        System.out.println("Animal Constructor called...");
    }

    void eats(){
        System.out.println("Eating...");
    }
}

class Cat extends Animal{
    String eyeColor;

    Cat(){
        System.out.println("Cat Constructor called...");
    }

    void getCatDetails(){
        System.out.println("Color: "+this.color +" | "+ "Breed: "+ this.breed +" | "+"EyeColor: " +this.eyeColor);
    }

    void walks(){
        System.out.println("Walking...");
    }
}

class kitten extends Cat{
    int weight;

    kitten(){
        System.out.println("Kitten Constructor Called...");
    }

    void sounds(){
        System.out.println("Meow...Meow...Meow...");
    }

    void getKittenDetails(){
        System.out.println("Color: "+this.color +" | "+ "Breed: "+ this.breed +" | "+"EyeColor: " +this.eyeColor +" | " + "Weight: "+ this.weight+"kg");
    }
}

class Fish extends Animal{
    int fins;

    Fish(){
        System.out.println("Fish Constructor Called...");
    }

    void getFishDetails(){
        System.out.println("Color: "+this.color +" | "+ "Breed: "+ this.breed +" | "+"Fins: " +this.fins);
    }

    void swims(){
        System.out.println("Swimmimg...");
    }

}