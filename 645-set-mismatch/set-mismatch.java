class Solution {
    public int[] findErrorNums(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();

        int n = nums.length;
        for(int num : nums){
            map.put(num, map.getOrDefault(num,0)+1);
        }

        int actualsum = n*(n+1)/2;
        int sum = 0 ;
        for(int i = 0 ; i < n ;  i++){
            sum += nums[i];
        }

        int duplicate = 0;
        for(int i = 0 ; i < n ; i++){
            if(map.get(nums[i]) == 2){
                duplicate = nums[i];
                list.add(nums[i]);
                break;
            }
        }

        int find = sum - duplicate;
        list.add(actualsum - find);

        int[] arr = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i); 
        }
        return arr;
    }
}