public class Polymorphism {

    public static int sum(int a,int b){
        return a + b;
    }
    public static int sum(int a,int b,int c){
        return a + b + c;
    }

    public static float sum(float a,float b){
        return a + b;
    }
    public static float sum(float a,float b,Float c){
        return a + b + c;
    }

    public static void main(String[] args) {

                                       // Compile Time / Overloading Polymorphism:)
        // ===================================
        // float a = (float) 9.2;
        // float b = (float) 2.1;
        // float c = (float) 3.7;

        // int a1 = 10;
        // int b1 = 20;
        // int c1 = 30;

        // System.out.println(sum(a1, b1));
        // System.out.println(sum(a1, b1,c1));
        // System.out.println(sum(a,b));
        // System.out.println(sum(a,b,c));

                                        // RunTime / Overriding Polymorphism:)
        Cat c1 = new Cat();
        c1.eat(); // Cat is Eating... :) we are overriding the method/function.

        
    }
    
}

class Animal{
    void eat(){
        System.out.println("Eating...");
    }
}

class Cat extends Animal{
    void eat(){
        System.out.println("Cat is Eating...");
    }
}