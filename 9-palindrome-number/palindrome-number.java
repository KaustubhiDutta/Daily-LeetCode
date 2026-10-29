import java.util.*;

class Solution {
    public static boolean isPalindrome(int x) {
       if(x<0){
            return false;
        }
        int y=x;
        int k=0;
        while(x>0){
            k=k*10+x%10;
            x=x/10;
        }
        if(k==y){
            return true;
        }
        return false;
    }


    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("x = ");
        int x = sc.nextInt();
        isPalindrome(x);
    }
}