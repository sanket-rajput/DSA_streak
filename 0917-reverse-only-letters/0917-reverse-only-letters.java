class Solution {
    public String reverseOnlyLetters(String s) {
        
        StringBuilder sb = new StringBuilder(s);
        int i =0, j=s.length()-1;
        
        while(i<j){

            
                while(!Character.isLetter(sb.charAt(i))){
                    if(i<j)
                    {i++;}
                    else{
                        break;
                    }   
                }
            
            
                while(!Character.isLetter(sb.charAt(j))){
                   if(j>i){
                        j--;   
                   }
                   else{
                    break;
                   }
                }
            
            char temp = sb.charAt(i);

            sb.setCharAt(i,sb.charAt(j));

            sb.setCharAt(j, temp);

            i++;
            j--;
        }

        return sb.toString();
        
        }
}