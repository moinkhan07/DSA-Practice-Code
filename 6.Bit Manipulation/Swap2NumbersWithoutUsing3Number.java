public class Swap2NumbersWithoutUsing3Number {

    public static void swap(int a,int b) {        
        a = a+b; // Instead of + and - we can use '^' this operator;
        b = a-b;
        a = a-b;
        System.out.println("Swapped:) "+a+" "+b);
    }

    public static void main(String[] args) {
        int a = 4;
        int b = 5;
        System.out.println("Before Swapped:) "+a+" "+b);
        swap(a, b);
    }
    
}
