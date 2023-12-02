import java.util.Scanner;

public class Vowels {

    public static int vowelsCount(String str) {
        int count = 0;
        StringBuilder sb = new StringBuilder("");
        for(int i = 0;i < str.length();i++){
            char ch = str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                sb.append(ch + " ");
                count++;
            }
        }
        System.out.println(sb);
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your word/sentence:)");
        String input = sc.nextLine();
        System.out.println("There are "+vowelsCount(input)+" vowels in your input.");
        sc.close();
    }
    
}
