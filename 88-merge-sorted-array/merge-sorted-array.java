class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] merge = new int[n+m];
        int k = 0;
        int i = 0;
        int j = 0;

        while(i < m && j < n ){
            if(nums1[i] <= nums2[j]){
                merge[k] = nums1[i];
                i++;
            }
            else {
                merge[k] = nums2[j];
                j++;
            }
            k++;
        }
    
    while(i < m ){
        merge[k] = nums1[i];
        k++;
        i++;
    }

    while(j < n ){
       merge[k] = nums2[j];
       k++;
       j++;
    }

    for( i = 0 ; i < merge.length ; i++){
       nums1[i] = merge[i];
    }
    
    }
}