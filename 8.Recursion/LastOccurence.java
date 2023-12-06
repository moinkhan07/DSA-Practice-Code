public class LastOccurence {

    public static int lastOccur(int arr[],int i,int key) {
        if(i == arr.length-1 && arr[i] != key){
            return -1;
        }
        int isFound = lastOccur(arr, i+1, key);
        if(isFound == -1 && arr[i] == key){
            return i;
        }
        return isFound;
    }

    public static void main(String[] args) {
        int arr[] = {1,5,7,3,9,3,6,8,1,3,4,7};
        int key = 3;
        int i = 0;
        System.out.println(lastOccur(arr, i, key));
    }
    
}
