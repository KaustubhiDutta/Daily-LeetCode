class Solution {
    public int maxOperations(int[] nums, int k) {
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num, map.getOrDefault(num,0) +1);
        }


        int operations = 0;
        for(int i = 0 ; i < n ; i++){
            int x = nums[i];
            int find = k - x;
        if (x == find) {
            if (map.get(x) >= 2) {
            map.put(x, map.get(x) - 2);
            operations++;
        }
} 
        else if (map.getOrDefault(x, 0) > 0 &&
           map.getOrDefault(find, 0) > 0) {

        map.put(x, map.get(x) - 1);
        map.put(find, map.get(find) - 1);
        operations++;
}
        }
        return operations;
    }
}