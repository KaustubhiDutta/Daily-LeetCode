class Solution {
    public boolean rotateString(String s, String goal) {
        
        String newstring = s + s ;
        if(s.length() == goal.length()){
        if(newstring.contains(goal)){
            return true;
        }
        }
        return false;
    }
}