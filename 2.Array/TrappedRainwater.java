public class TrappedRainwater {

    public static int trappedRainwater(int heights[]){
        int n = heights.length;
        
        int leftMax[] = new int[n];
        leftMax[0] = heights[0];
        for(int i = 1;i < n;i++){
            leftMax[i] = Math.max(heights[i],leftMax[i-1]);
        }

        int rightMax[] = new int[n];
        rightMax[n-1] = heights[n-1];
        for(int i = n-2;i >= 0;i--){
            rightMax[i] = Math.max(heights[i], rightMax[i+1]);
        }
        int trappedRainwater = 0;
        for(int i = 0;i < n;i++){
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            trappedRainwater += waterLevel - heights[i];
        }
        return  trappedRainwater;
    }

    public static void main(String[] args) {
        int heights[] = {4,2,0,6,3,2,5};
        int trappedWater = trappedRainwater(heights);
        System.out.println("The Trapped Rainwater will be "+ trappedWater);
    }
}
