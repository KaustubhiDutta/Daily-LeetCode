class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int num : nums){
            map.put(num, map.getOrDefault(num ,0) + 1);
        }
      //Using bucket sort

      ArrayList<Integer>[] bucket = new ArrayList[n+1];

    for(int i = 0 ; i <= n ; i ++){
        bucket[i] = new ArrayList<>();
    }

    for(int x : map.keySet()){
        int freq = map.get(x);
        bucket[freq].add(x);
    }

    int[] arr = new int[k];
    int y = 0;
    for(int i = n ; i >= 1 && y < k ;i--){
        for(int num : bucket[i]){
        arr[y] = num;
        y++;

        if(y == k){
        break;
    }
        }
    }
       return arr;
    }
}