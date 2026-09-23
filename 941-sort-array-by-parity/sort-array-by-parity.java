class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int n = nums.length;
        int i = 0 ;
        int j = 1;

        while(i < n && j < n){
            if(nums[j] % 2 == 0){
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                i++;
                j = i+1;
            }
            else{
            j++;
            }
        }

        return nums;
    }
}