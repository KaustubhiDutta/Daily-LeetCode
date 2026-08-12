class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        ArrayList <Integer> index = new ArrayList<>();
        int n = nums.length;
    
        Arrays.sort(nums);

    int start1 = 0;
    int end1 = n-1;
    int start2 = 0;
    int end2 = n-1;
    int last = -1;
    int first = -1;

     while(start2 <= end2){
        int mid = start2 + (end2 - start2)/2;

        if(nums[mid] == target){
            if(mid == 0 || nums[mid-1] != target){
                first = mid;
                break;
            }
            else if(nums[mid-1] == target){
               end2 = mid-1;
            }
        }

        else if( nums[mid] < target){
            start2 = mid +1;
        }
        else{
            end2 = mid-1;
        }
    }

    while(start1 <= end1){
        int mid = start1 + (end1 - start1)/2;

        if(nums[mid] == target){
            if(mid == n-1 || nums[mid+1] != target){
                last = mid;
                break;
            }
            else if(nums[mid+1] == target){
               start1 = mid+1;
            }
        }

        else if( nums[mid] < target){
            start1 = mid +1;
        }
        else{
            end1 = mid-1;
        }
    }


    for(int i = first; i <= last ; i++){
        index.add(i);
    }
    if(index.contains(-1)){
        return List.of();
    }
    return index;
    }
}