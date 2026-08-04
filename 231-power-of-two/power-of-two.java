//using recursion
class Solution {

    public static int poweroftwo(int x){
       int power = 1;
        if(x > 0){
        power = 2 * poweroftwo(x-1);
        }
         return power;
    }
    public boolean isPowerOfTwo(int n) {
        int x = (int)(Math.log(n)/Math.log(2));

        if(poweroftwo(x) == n){
            return true;
        }
        return false;
    }
}