class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int n = piles.length;
        int max =Integer.MIN_VALUE;
        for(int i = 0 ; i <n ; i++){
            if(max < piles[i]){
                max = piles[i];
            }
        }
        int low  = 1 ;
        int high = max;
        int ans= Integer.MAX_VALUE;
        
        while(low <= high){
            int mid = low +(high- low)/2;
            long total = 0;

            for(int i = 0 ; i < n ; i++){
                total += (int)Math.ceil((double)piles[i]/mid);
            }

            if(total <= h){
                ans = mid;
                high = mid - 1;

            }
            else{
                low = mid + 1;
            }
        }

       return ans;
    }
}