public class OddOrEven {

    public static void oddOrEven(int n) {
        int bitMask = 1;
        if((n & bitMask) == 0){
            System.out.println(n+" is even number");
        }else{
            System.out.println(n+" is odd number");
        }
    }

    public static void main(String[] args) {
        oddOrEven(3);
        oddOrEven(12);
    }
    
}
