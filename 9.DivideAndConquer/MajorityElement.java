public class MajorityElement{
    public static int majorityElement(int arr[]) {
        int largest = arr[0];
        
        for (int i = 1; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }
        int count[] = new int[largest+1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }
        int maxCount = 0;
        int majorityElement = 0;

        for (int i = 0; i < count.length; i++) {
            if (count[i] > maxCount) {
                maxCount = count[i];
                majorityElement = i;
            }
        }
        return majorityElement;
    }

    public static void main(String[] args) {
        int arr[] = {2,2,1,1,1,2,2};
        System.out.println(majorityElement(arr));
    }
}