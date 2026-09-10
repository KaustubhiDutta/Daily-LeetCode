class Solution {
    public int maxArea(int[] height) {
        int maxwater = 0;
        int n = height.length;
        int i = 0;
        int j = n-1;
        
        while( i < j){
            int width = j-i;
            int ht = Math.min( height[i] , height[j]);
            int area = width * ht;
            maxwater = Math.max( maxwater , area);

            int min = height[i] < height[j] ? i++ : j--;
        }
        return maxwater;
    }
}