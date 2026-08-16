class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int left = 0;       //used for shrinking when traget fulfills the condition
        int sum = 0;        //keeps the track of subarrays's sum
        int ans = Integer.MAX_VALUE;   //stores min length of subarray


        //right is used for expansion until it satisfies the condition
        for(int right = 0; right < n ; right++){

            sum += nums[right];
            
            while(sum >= target ){
                int len = right - left + 1;
                ans = Math.min(ans , len);
                sum -= nums[left];
                left++;
            }
        }
        
        if( ans == Integer.MAX_VALUE){
            return 0;
        }
        return ans;

    }
}