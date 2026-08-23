class Solution {
    public int findDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int n = nums.length;
        int duplicate = nums[0];
        for(int i = 0 ; i < n ; i++){
            if(set.contains(nums[i])){
                duplicate  = nums[i];
            }
            set.add(nums[i]);
        }
        return duplicate;
    }
}