class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        int[] leftsum = new int[n];
        int[] rightsum = new int[n];

        leftsum[0] = 0;

        int sum = 0;
        for(int i = 1 ; i < n ; i++){
            sum += nums[i];
        }

        rightsum[0] = sum;

        for(int i = 1 ; i < n ; i++){
            leftsum[i] = leftsum[i-1] + nums[i-1];
            rightsum[i] = rightsum[i-1] - nums[i];
        }

        // int idx = -1;
        int k = 0;
        
        while(k < n){
            if(leftsum[k] == rightsum[k]){
               return k; 
            }
            k++;
        }

        return -1;
    }
}