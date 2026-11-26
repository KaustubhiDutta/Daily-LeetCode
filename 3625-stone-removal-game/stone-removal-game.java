class Solution {
    public boolean canAliceWin(int n) {
        if(n < 10){
            return false;        
        }
      //count -> even = bob win
      int count = 0;
      int num = n;  
      int stones = 10;
      
      while(num > 1 && stones > 0){
        num -= stones;
        stones--;
        count++;
        if(num < 0){
            count --;
        }
      }
      
      if(count % 2 == 0){
        return false;
      }
      return true;

    }
   
}