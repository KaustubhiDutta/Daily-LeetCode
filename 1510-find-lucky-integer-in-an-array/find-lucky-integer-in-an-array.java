class Solution {
    public int findLucky(int[] arr) {
        int n = arr.length;

        int m = 0;

        for(int i = 0 ; i < n ; i++){
            if(arr[i] > m){
                m = arr[i];
            }
        }

        int[] freq = new int[m + 1];

       for(int i = 0 ; i < n ; i++){
        freq[arr[i]]++;
       }

        int max = -1;
       for(int i = 0 ; i < n ; i++){
        if(arr[i] == freq[arr[i]]){
            if(arr[i] > max){
                max = arr[i];
            }
        }
       }

       return max ;
    }
}