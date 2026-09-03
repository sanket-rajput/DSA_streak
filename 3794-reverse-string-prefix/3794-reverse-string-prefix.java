class Solution {
    public String reversePrefix(String s, int k) {

        StringBuilder sb = new StringBuilder();


        for(int j=k-1;j>=0;j--){
            sb.append(s.charAt(j));
        }
        for(int j=k;j<s.length();j++){
            sb.append(s.charAt(j));
        }

        return sb.toString();
        
    }
}