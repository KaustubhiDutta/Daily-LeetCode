class Solution {
    public boolean closeStrings(String word1, String word2) {
        char w1[] = word1.toCharArray();
        char w2[] = word2.toCharArray();

        Arrays.sort(w1);
        Arrays.sort(w2);
        
        String sorted1 = new String(w1);
        String sorted2 = new String(w2);

        int[] freq1 = new int[26];
        int[] freq2 = new int[26];

        for(int i= 0 ; i < sorted1.length() ; i++){
            freq1[sorted1.charAt(i) - 'a']++;
        }

        for(int i= 0 ; i < sorted2.length() ; i++){
            freq2[sorted2.charAt(i) - 'a']++;
        }

        Arrays.sort(freq1);
        Arrays.sort(freq2);

        HashSet<Character> set1 = new HashSet<>();
        HashSet<Character> set2 = new HashSet<>();


        for(char c1 : w1){
            set1.add(c1);
        }

        for(char c2 : w2 ){
            set2.add(c2);
        }


        if(word1.length() ==  word2.length()){
        
            if(sorted1.equals(sorted2)){
                return true;
            }
            else if(set1.equals(set2) && Arrays.equals(freq1,freq2)){
                return true;
            }
        }
        
        return false;
    }
}