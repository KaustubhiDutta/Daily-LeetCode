class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int num : nums){
            map.put(num, map.getOrDefault(num,0) + 1);
        }

        int i=1;
        while(i > 0){
            if(!map.containsKey(k*i)){
                return k*i;
            }
            i++;
        }
        return k;
    }
}