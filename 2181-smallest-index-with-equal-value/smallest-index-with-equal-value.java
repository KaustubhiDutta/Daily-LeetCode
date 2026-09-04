class Solution {
    public int smallestEqual(int[] nums) {
        int n = nums.length;
        for(int i = 0 ; i < n ; i++){
            int rem = i % 10;

            if(rem == nums[i] || rem == -1){
                return i;
            }
        }
        return -1;
    }
}