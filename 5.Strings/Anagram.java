public class Anagram{

    public static boolean anagram(String str1,String str2) { // O(n)
        if(str1.length() != str2.length()){
            return false;
        }
        int charCount[] = new int[256];
        for(int i = 0;i < str1.length();i++){
           charCount[str1.charAt(i)]++;
           charCount[str2.charAt(i)]--;
        }

        for (int count : charCount) {
            if(count != 0){
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String str1 = "racecar";
        String str2 = "carerac";
        System.out.println(anagram(str1, str2));
    }
}