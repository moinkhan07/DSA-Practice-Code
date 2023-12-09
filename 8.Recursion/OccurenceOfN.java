public class OccurenceOfN{

    public static void printIndexOfOccurenceOfKey(int arr [],int i,StringBuilder sb, int key){
        if(i == arr.length){
            System.out.println(sb);
            return;
        }
        if(arr[i] == key){
            sb.append(i+" ");
        }
        printIndexOfOccurenceOfKey(arr, i+1, sb, key);
    }

    public static void main(String[] args) {

        int arr[] = {3,2,4,5,6,2,7,2,2};
        int key = 2;
        printIndexOfOccurenceOfKey(arr,0, new StringBuilder(""), key);
        
    }

}