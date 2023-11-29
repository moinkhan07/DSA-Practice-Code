public class SearchInSortedArrayUsingStaircaseTechnique {
    
    public static boolean staircaseSearch(int arr[][],int key) {
        int i = 0;
        int j = arr[0].length-1;
        // Time Complexity =  O(n+m)
        while(i < arr.length && j >= 0){
            if(arr[i][j] == key){
                System.out.println("Key found at ("+i +"," + j +")");
                return true;
            }
            else if(key < arr[i][j]){
                j--;
            }
            else{
                i++;
            }
        }
        
        System.out.println("Not found!");
        return false;
    }

    public static void main(String[] args) {
        int arr[][] = {
            {10,20,30,40},
            {15,25,35,45},
            {27,29,37,48},
            {32,33,39,50}
        };
        staircaseSearch(arr, 45);
    }

}
