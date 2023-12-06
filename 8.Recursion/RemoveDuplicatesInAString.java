public class RemoveDuplicatesInAString {

    public static void duplicates(String str,int ind,StringBuilder sb,boolean map[]) {
        if(ind == str.length()){
            System.out.println(sb);
            return;
        }
        char currChar = str.charAt(ind);
        if(map[currChar - 'a'] == true){
            duplicates(str, ind+1, sb, map);
        }else{
            map[currChar - 'a'] = true;
            duplicates(str, ind+1, sb.append(currChar), map);
        }
        
    }

    public static void main(String[] args) {
        String str = "helloworld";
        System.out.println("Original:) "+ str);
        duplicates(str,0,new StringBuilder(),new boolean[26]);
    }
    
}
