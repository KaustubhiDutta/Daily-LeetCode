class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int n = nums.length;
        int max = Integer.MIN_VALUE;
        int inc = Integer.MIN_VALUE;
        int dec = Integer.MIN_VALUE;

        int len1 = 0;
        for(int i = 0; i < n; i++){
            int j = i;
            while(j<n-1 && nums[j] < nums[j+1]){
            j++;
            }
            len1 = (j-i) + 1;
            inc = Math.max(inc,len1);
            
        }

        int len2 = 0;
        for(int i = 0; i < n; i++){
            int j = i;
            while(j<n-1 && nums[j] > nums[j+1]){
            j++;
            }
            len2 = (j-i)+1;
            dec = Math.max(dec,len2);
            
        }
        max = Math.max(inc,dec);

        return max;
    }
}