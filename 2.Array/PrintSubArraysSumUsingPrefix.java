public class PrintSubArraysSumUsingPrefix {
    public static void printSubArrays(int num[]){
        int n = num.length;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int sumOfSubArrays = 0;
        int prefix[] = new int[n];
        prefix[0] = num[0];
        for(int i = 1;i < n;i++){
            prefix[i] = prefix[i-1] + num[i];
        }

        for(int i = 0;i < n;i++){
            for(int j = i;j < n;j++){
                if(i == 0){
                    sumOfSubArrays = prefix[j];
                }else{
                    sumOfSubArrays = prefix[j] - prefix[i - 1];
                }
               
                if(min > sumOfSubArrays){
                    min = sumOfSubArrays;
                }
                if(max < sumOfSubArrays){
                    max = sumOfSubArrays;
                }
            }
        }
        System.out.println("Min Sum Of SubArray is :) "+ min);
        System.out.println("Max Sum Of SubArray is :) "+ max);
    }

    public static void main(String[] args) {
        // int num[] = {2,4,6,8,10};
        int num[] = {1,-2,6,-1,3};
        printSubArrays(num);
    }
}
