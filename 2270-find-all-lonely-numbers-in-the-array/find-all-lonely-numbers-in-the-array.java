class Solution {
    public List<Integer> findLonely(int[] nums) {
        int n  = nums.length;
        ArrayList<Integer> list = new ArrayList();
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int num : nums){
            map.put(num, map.getOrDefault(num,0)+1);
        }

        for(int i = 0 ; i < n ; i++){
            if(map.get(nums[i]) == 1 && !map.containsKey(nums[i] + 1) && !map.containsKey(nums[i] - 1) ){
                list.add(nums[i]);
            }
        }
        return list;
    }
}