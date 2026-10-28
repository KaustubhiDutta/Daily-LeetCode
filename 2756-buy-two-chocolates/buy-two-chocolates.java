class Solution {
    public int buyChoco(int[] prices, int money) {
        int n = prices.length;
        Arrays.sort(prices);
        int i = 0;
        int j = i+1;
        int left = 0;
        while( i < n && j < n){
            int sum = 0;
            sum  = prices[i] + prices[j];
            left = money - sum;

            if(left >= 0){
                return left;
            }
            i++;
            j++;
        }
        return money;
    }
}