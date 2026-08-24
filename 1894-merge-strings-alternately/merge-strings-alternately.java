class Solution {
    public String mergeAlternately(String word1, String word2) {
        
        char[] word1char = word1.toCharArray();
        char[] word2char = word2.toCharArray();
        int n = word1char.length;
        int m = word2char.length;

        char merge[] = new char[n+m];
        int w1 = 1;
        int w2 = 0;
        int k = 1;

        merge[0] = word1char[0];

        while(w1 < n && w2 < m){
          if(k%2==0){
            merge[k] = word1char[w1];
            w1++;
          }
          else{
            merge[k] = word2char[w2];
            w2++;
          }
          k++;
        }

         while(w1 < n){
            merge[k] = word1char[w1];
            w1++;
            k++;
        }
        
        while(w2 < m){
            merge[k] = word2char[w2];
            w2++;
            k++;
        }

        StringBuilder sb = new StringBuilder("");
        for(int i = 0 ; i < merge.length ; i++){
            sb.append(merge[i]);
        }
       String merged = sb.toString();

       return merged;
    }
}