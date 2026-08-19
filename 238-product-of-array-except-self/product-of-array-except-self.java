class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int prod = 1;
        int count = 0;
        int[] product = new int[n];
        for(int i = 0 ; i < n ; i++){
            if(nums[i] == 0){
                count++;
                continue;
            }
            prod *= nums[i] ;
        }

        
        for(int i = 0 ; i < n ; i++){
            if(count == 0){
                product[i] = prod / nums[i];
            }
            else if((count == 1)){
                if(nums[i] == 0){
                    product[i] = prod;
                }
                else{
                    product[i] = 0;
                }
            }
            else if(count > 1){
                product[i] = 0;
            }
           
        }

        return product;
    }
}