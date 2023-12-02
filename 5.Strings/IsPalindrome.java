class IsPalindrome{

    public static void isPalindrome(String str) { // O(n)
                        // 1st way
        // String bag = "";
        // for(int i = str.length()-1;i >=0; i--){
        //     bag += str.charAt(i);
        // }

        // if(str.equals(bag)){
        //     System.out.println("Palindrome!");
        // }else{
        //     System.out.println("Not a palindrome!");
        // }
                         // 2nd way
        // int i = 0;
        // int j = str.length()-1;
        // boolean flag = false;
        // while(i <= j){
        //     if(str.charAt(i) == str.charAt(j)){
        //         i++;
        //         j--;
        //         flag = true;
        //     }else{
        //         System.out.println(str+ " is not a palindrome");
        //         break;
        //     }
        // }
        // if(flag){
        //     System.out.println( str+ " is a Palindrome");
        // }

    }

    public static void main(String[] args) {
        String str = "MoinKhan";
        String str2 = "naman";

        isPalindrome(str);
        isPalindrome(str2);
        
    }
}