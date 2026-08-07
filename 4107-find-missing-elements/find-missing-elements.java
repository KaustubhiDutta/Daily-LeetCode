class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();

        int min =Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i = 0 ; i < nums.length ; i ++){
            if(min > nums[i]){
                min = nums[i];
            }
            if( max < nums[i]){
                max = nums[i];
            }
        }

       HashMap<Integer , Integer> map = new HashMap<>();
       for(int num : nums){
        map.put(num , map.getOrDefault(num,0)+1);
       }
    ArrayList<Integer> range = new ArrayList<>();
    
    for(int i = min; i <= max ; i++){
        range.add(i);
    }
       for(int i = 0 ; i < range.size() ; i++){
        if(!map.containsKey(range.get(i))){
            list.add(range.get(i));
        }
       }
    return list;    
    }
}