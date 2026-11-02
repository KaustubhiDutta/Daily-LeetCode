class Solution {
    public int minMoves2(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int mid = n/2;
        
        int moves = 0;
        int diff = 0;
        for(int i = 0 ; i < n ; i++){
            diff = nums[mid] - nums[i];

            if(diff < 0){
                diff = Math.abs(diff);
            }

            moves += diff;
        }

        return moves;
    }
}