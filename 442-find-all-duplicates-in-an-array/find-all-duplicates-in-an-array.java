class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        ArrayList<Integer> duplicate = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
         for(int x : nums){
            map.put(x,map.getOrDefault(x,0) +1);
         }

        int[] unique = Arrays.stream(nums).distinct().toArray();
         for(int num : unique){
            if(map.get(num) == 2){
                duplicate.add(num);
            }
         }
         return duplicate;
    }
}