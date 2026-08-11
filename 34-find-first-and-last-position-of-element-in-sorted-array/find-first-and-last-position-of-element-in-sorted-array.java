class Solution {
    public int[] searchRange(int[] nums, int target) {
       
        int n = nums.length;
       
        int firststart = 0 ; 
        int firstend = n-1;
        int firstocc = -1;
        int lastocc = -1;

        while(firststart <= firstend){
            int mid = firststart + (firstend - firststart)/2;

            if(  nums[mid] == target){
                 if(mid == 0 || nums[mid - 1] != target ){
                    firstocc = mid;
                  break;
                }
               else if(  nums[mid - 1] == target){
                    firstend = mid-1;
                }
            }

            else if( nums[ mid] < target ){
                firststart = mid + 1;
            }
            else{
                firstend = mid - 1;
            }
           
        }


        int laststart = 0 ; 
        int lastend = n-1;
       

        while(laststart <= lastend){
            int mid = laststart + (lastend - laststart)/2;

            if(nums[mid] == target){
                if( mid == n-1 || nums[mid + 1] != target){
                    lastocc = mid;
                   break;
                }
                else if(  nums[mid + 1] == target ){
                    laststart = mid+1;
                }
               
            }

            else if( nums[ mid] < target ){
                laststart = mid + 1;
            }
            else{
                lastend = mid - 1;
            }
           
        }


      return new int[] {firstocc,lastocc};
    }
}