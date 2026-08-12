class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        ArrayList <Integer> index = new ArrayList<>();
        int n = nums.length;
    
        Arrays.sort(nums);

    for(int i = 0 ; i < n ; i++){
       if(nums[i] == target){
         index.add(i);
       }
    }
        return index;
    }
}