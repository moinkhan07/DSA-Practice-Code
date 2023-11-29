public class binToDec {

    public static void binaToDec(int num){
        int  pow = 0;
        int decNum = 0;
        int binNum = num;

        while(num > 0){
            int ld = num % 10;
            decNum = decNum + (ld * (int) Math.pow(2, pow));
            pow++;
            num = num / 10;
        }
        System.out.println("Decimal of "+ binNum  +" is " + decNum );
    }

    public static void main(String[] args) {
       binaToDec(111);
    }
}
