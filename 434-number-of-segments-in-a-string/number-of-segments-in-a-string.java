class Solution {
    public int countSegments(String s) {

    
        String[] words =  s.trim().split("\\s+");
        int seg = s.trim().isEmpty() ? 0 : words.length;

        return seg;
       
    }
}