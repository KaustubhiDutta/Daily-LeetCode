class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        HashMap<Integer,Integer> map1 = new HashMap<>();
        
        for(int num1 : nums1){
            map1.put(num1 , map1.getOrDefault(num1,0) + 1);
        }

      

        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i = 0 ; i < n2 ; i++){
            if(map1.containsKey(nums2[i])){
            int freq = map1.get(nums2[i]);
            if(freq > 0 ){
                list.add(nums2[i]);
                freq--;
                map1.put(nums2[i],freq);
            }
        }
        }

        int[] arr = new int[list.size()];
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = list.get(i);
        }
        
        return arr;
    }
}