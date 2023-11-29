class PrintSubArraysSumUsingKadanes{
    public static void kadanes(int num[]){
        int n = num.length;
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i = 0;i < n;i++){
           currSum = currSum + num[i];
           if(currSum < 0){
            currSum = 0;
           }
           maxSum = Math.max(currSum, maxSum);
        }
        System.out.println("Max Sum Of SubArray is :) "+ maxSum);
    }

    public static void main(String[] args) {
        // int num[] = {2,4,6,8,10};
        int num[] = {-2,-3,4,-1,-2,1,5,-3};
        kadanes(num);
    }
}