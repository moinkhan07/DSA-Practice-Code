public class FirstOccurence {

    public static int firstOccur(int arr[], int i,int key) {
        if(i == arr.length-1 && arr[i] != key){
            return -1;
        }
        if(arr[i] == key){
            return i;
        }
        return firstOccur(arr, i+1,key);
    }

    public static void main(String[] args) {
        int arr[] = {2};
        System.out.println(firstOccur(arr, 0,2));
    }
    
}
