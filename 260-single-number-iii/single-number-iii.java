class Solution {
    public int[] singleNumber(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        ArrayList<Integer> list =new ArrayList<>();

        for(int num : nums){
            map.put(num , map.getOrDefault(num,0)+1);
        }

        for(int x : nums){
            if(map.get(x) == 1){
                list.add(x);
            }
        }

    int[] arr = new int[list.size()];
        for(int i = 0; i < list.size(); i ++){
            arr[i] = list.get(i);
        }

        return arr;
    }
}