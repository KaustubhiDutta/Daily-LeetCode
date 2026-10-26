class Solution {
    public int sumsquare(int n ){
        int sum = 0;
        while(n > 0){
            int lastdig = n % 10;
            sum = sum + (lastdig * lastdig);
            n /= 10;
        }
        return sum;
    }
    public boolean isHappy(int n) {
        int num = n ;
        int check = sumsquare( num );

        HashSet<Integer> set = new HashSet<>();
        while(check != 1){
            if(set.contains(check)){
                return false;
            }
            set.add(check);
            num = check;
            check = sumsquare(num);
        }
        
        return true;
    }
}