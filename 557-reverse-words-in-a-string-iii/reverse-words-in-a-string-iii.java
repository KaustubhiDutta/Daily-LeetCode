class Solution {
    public String reverseWords(String s) {
        String reverse = "";
        for(int i = s.length() - 1 ; i >=0 ; i--){
            reverse += s.charAt(i);
        }

        String[] words = reverse.split(" ");
        int n = words.length;
        int i = 0 ;
        int j= n-1;

        while(i <= j){
            String temp = words[i];
            words[i] = words[j];
            words[j]= temp;
            i++;
            j--;
        }

        StringBuilder sb = new StringBuilder("");

        for( i = 0 ; i < n-1; i++){
            sb.append(words[i] + " ");
        }
            sb.append(words[n-1]);
        return sb.toString();
    }
}