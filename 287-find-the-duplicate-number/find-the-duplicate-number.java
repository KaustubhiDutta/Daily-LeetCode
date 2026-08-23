class Solution {
    public int findDuplicate(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();

        int n = nums.length;
        for(int num : nums){    
            map.put(num, map.getOrDefault(num,0)+1);
        }

        int duplicate = nums[0];
        for(int i = 0 ; i < n ; i++){
            if(map.get(nums[i])>=2){
                duplicate = nums[i];
                break;
            }
        }
        return duplicate;
    }
}