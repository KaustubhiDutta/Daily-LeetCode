class Solution {
    public int buyChoco(int[] prices, int money) {
        int n = prices.length;

        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
        for(int price : prices){
            if(price < first){
                second = first;
                first = price;
            }
            else if ( price < second){
                second  = price;
            }
        }
        int sum  = first + second;

        if(sum <= money){
            return money - sum;
        }
        return money;
    }
}