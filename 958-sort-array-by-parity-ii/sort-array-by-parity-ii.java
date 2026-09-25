class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int n = nums.length;

        int[] even = new int[ n/2 ];
        int[] odd = new int[ n/2 ];

        int i = 0;
        int e = 0 ;
        int o = 0;
        while(i < n){
            if(nums[i] % 2 == 0){
                even[e] = nums[i];
                e++;
            }
            else{
                odd[o] = nums[i];
                o++;
            }
            i++;
        }

        int k = 0 ;
         e = 0;
         o = 0;
        while(k < n ){
            if( k % 2 == 0){
                nums[k] = even[e];
                e++;
            }
            else{
                nums[k] = odd[o];
                o++;
            }
            k++;
        }
        return nums;
    }
}