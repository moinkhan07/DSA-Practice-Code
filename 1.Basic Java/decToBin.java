public class decToBin {
    public static void deciToBin(int num){
        int pow  = 0;
        int binNum = 0;
        int myNum = num;

        while(num > 0){
            int rem = num % 2;
            binNum = binNum +(rem * (int)Math.pow(10, pow));
            pow++;
            num = num /2;
            System.out.println("Num = "+ num);
        }
        System.out.println("Binary of "+ myNum + " is " + binNum);
    }

    public static void main(String[] args) {
       deciToBin(7);
    }

}
