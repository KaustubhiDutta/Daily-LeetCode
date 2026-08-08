class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
      ArrayList<Integer> positive = new ArrayList<>();
      ArrayList<Integer> negative = new ArrayList<>();

      for(int i=0; i < n ; i++){
        if(nums[i] > 0){
            positive.add(nums[i]);
        }
      }
      for(int i=0; i < n ; i++){
        if(nums[i] < 0){
            negative.add(nums[i]);
        }
      }

        int p = 0;
        int m =0;
        int k = 0 ;
        while( k < n){
           if(  k%2==0 && p <= positive.size()){
            nums[k] = positive.get(p);
            p++;
           }
           else if( k%2!=0 && m <= negative.size()){
            nums[k] = negative.get(m);
            m++;
           }
           k++;
        }
      

    return nums;
    }
}