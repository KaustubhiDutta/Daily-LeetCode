class Solution {
    public int smallestNumber(int n, int t) {
      int num = n;
      while(num>=n){
        int temp = num;
        int prod = 1;
       
        while( temp > 0){
            prod = prod * (temp % 10);
            temp/=10;
        }
        
        if(prod % t == 0){
            return num;
        }
        num++;
    }
      return 0;
    }
}