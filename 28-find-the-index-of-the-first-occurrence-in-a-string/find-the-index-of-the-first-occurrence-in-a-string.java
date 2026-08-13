class Solution {
    public int strStr(String haystack, String needle) {
        int str1 =haystack.length();
        int str2 = needle.length();
        int i = 0;
        int j = 0;
        int k =0;

        while(i < str1 &&  j < str2 && k<str1){
            if(haystack.charAt(i) != needle.charAt(j)){
                k++;
                i=k;
                j=0;
            }
            else{
            i++;
            j++;
            }
        }
        if(j==str2 ){
            return i-str2 ;
        }
        return -1;
    }
}