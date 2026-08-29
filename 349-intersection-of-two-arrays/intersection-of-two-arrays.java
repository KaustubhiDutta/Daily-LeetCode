class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>();
        for(int nums : nums1){
            if(!set.contains(nums)){
                set.add(nums);
            }
        }

         for(int num : nums2){
            if(!set2.contains(num)){
                set2.add(num);
            }
        }

        for(int x : set2){
            if(set.contains(x)){
                list.add(x);
            }
        }
        
        int[] arr = new int[list.size()];

        for(int i = 0 ;i < list.size() ; i++){
            arr[i] = list.get(i);
        }
        return arr;
    }
}