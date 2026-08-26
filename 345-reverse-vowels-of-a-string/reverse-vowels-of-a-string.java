class Solution {
    public boolean isVowel(char c){
        return c =='a'||c =='e' || c =='i'||c =='o'||c == 'u'||c =='A'||c =='E' || c =='I'||c =='O'||c == 'U';
    }
    public String reverseVowels(String s) {
        char[] arr = s.toCharArray();
        int start = 0;
        int end = arr.length - 1;

        while(start < end){
            while( start < end && !isVowel(arr[start])){
                start++;
            }
            while( start < end && !isVowel(arr[end])){
                end --;
            }

            if(start < end ){
                char temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }
        return new String(arr);


    }
}