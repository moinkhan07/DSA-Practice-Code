public class Interfaces {
    public static void main(String[] args) {
        Queen q1 = new Queen();
        q1.moves();

        King k1 = new King();
        k1.moves();

        Bear b1 = new Bear();
        b1.grassEat();
        b1.meatEats();

    }
}

interface Herbivores{
    void grassEat();
}

interface Carnivores{
    void meatEats();
}

class Bear implements Herbivores,Carnivores{

    @Override
    public void meatEats() {
        System.out.println("Bear eats meat!");
    }

    @Override
    public void grassEat() {
        System.out.println("Bear eats grass and leaves!");
    }
    
}

class Crows implements Herbivores,Carnivores{

    @Override
    public void meatEats() {
        System.out.println("Crow eats meat!");
    }

    @Override
    public void grassEat() {
        System.out.println("Crow east seads and herbivores vegetables");
    }
    
}


interface Chess{
    void moves();
}

class King implements Chess{

    @Override
    public void moves() {
        System.out.println("KING:) Left,Right,Top,Bottom,Diagonal - (by 1 step)");
    }
    
}

class Queen implements Chess{

    @Override
    public void moves() {
        System.out.println("QUEEN:) Left,Right,Top,Bottom,Diagonal");
    }
    
}

