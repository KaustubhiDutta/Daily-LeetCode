class Solution {
    public String removeDuplicates(String s) {
        int n = s.length();

        StringBuilder sb = new StringBuilder("");
        

        for(int i = 0 ; i < n ; i++){
            char curr = s.charAt(i);

            if(sb.length() > 0  && curr ==  sb.charAt(sb.length() - 1) ){
                sb.deleteCharAt(sb.length() - 1);
            }
            else{
            sb.append(s.charAt(i));
            }
        }

        String res = sb.toString();
        return res;
    }
}