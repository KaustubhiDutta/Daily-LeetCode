class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int n = nums.length;
        for(int i = 0 ; i < n ; i++){
            if(nums[i] % 2 == 0){
                nums[i] = 0;
            }
            else{
                nums[i] = 1;
            }
        }

        int count = 0;
        int prefix = 0;
        map.put(0,1);
        for(int num : nums){
            prefix += num;

            if(map.containsKey(prefix - k )){
                count+=map.get(prefix - k);
            }
            map.put(prefix,map.getOrDefault(prefix,0) +1);
        }

        return count;
    }
}