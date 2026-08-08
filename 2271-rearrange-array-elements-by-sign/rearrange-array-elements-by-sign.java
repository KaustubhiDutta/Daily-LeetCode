class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        int positive = 0;
        int negative = 1;

        for(int num : nums){
            if(num > 0){
                result[positive]=num;
                positive = positive+2;
            }
            else if(num < 0){
                result[negative]=num;
               negative = negative+2;
            }
        }
      

    return result;
    }
}