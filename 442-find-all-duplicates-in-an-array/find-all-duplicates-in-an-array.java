class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        ArrayList<Integer> duplicate = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
         for(int x : nums){
            map.put(x,map.getOrDefault(x,0) +1);
         }

        for(int i = 0 ; i < nums.length ; i++){
            if(map.get(nums[i]) == 2){
                duplicate.add(nums[i]);
            }
        }

        return new ArrayList<>(new HashSet<>(duplicate));
    }
}