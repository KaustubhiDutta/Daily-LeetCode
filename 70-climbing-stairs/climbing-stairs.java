class Solution {
    public int climbStairs(int n) {
        
        if(n==1 || n==2){
            return n;
        }

        int step2 = 1;
        int step1 = 2;
        
        for(int i = 3 ; i <= n ; i++){
            int curr = step2 + step1 ;

            step2 = step1 ;
            step1 = curr;
        }
        

        return step1;
    }
}