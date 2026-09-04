class Solution {
    public static String encode(String s) {
        // code here
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<s.length(); i++){
            sb.append(s.charAt(i));
            int count = 1;
            
            while(i+1 < s.length() && s.charAt(i) == s.charAt(i+1)){ 
                count++;
                i++;
            }
            sb.append(count);
        }
        return sb.toString();
    }
}