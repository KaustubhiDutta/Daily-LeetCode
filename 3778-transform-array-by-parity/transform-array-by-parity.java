class Solution {
    public int[] transformArray(int[] nums) {
        int n = nums.length;
        
        for(int i = 0 ; i < n ; i++){
            if(nums[i] % 2 == 0){
                nums[i] = 0;
            }
            else{
                nums[i] = 1;
            }
        }

        int count0 = 0 ;
        int count1 = 0 ;
        for(int i = 0 ; i < n ; i++){
            if(nums[i] == 0){
                count0++;
            }
            else {
                count1++;
            }
        }

        int k = 0;
        while(k < count0){
            nums[k] = 0;
            k++;
        }
        
        while(k < n){
            nums[k] = 1;
            k++;
        }
        
        return nums;
    }
}