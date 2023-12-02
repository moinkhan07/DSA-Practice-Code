class Operator{
    public static void main(String[] args) { 
        System.out.println(5&6); // 4 - And
        System.out.println(5|6); // 7 - Or
        System.out.println(5^6); // 3 - Xor
        System.out.println(~5);  // -6 - binary 1's compliment
        System.out.println(5<<2); // 20 - binary left shift :) formula- (a*b^2) = 5 * 4 = "20"
        System.out.println(5>>2); // 1 - binary right shift :) formula- (a/2^b) = 5 / 4 = "1"
    }
}