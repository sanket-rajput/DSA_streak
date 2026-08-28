class Solution {
    public int maxVowels(String s, int k) {

        int maxvow =0;

        for(int i =0;i<k;i++){

            if(s.charAt(i)=='a' ||s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u'){
                maxvow++;

            }
        }
        int i =0;
        int j =k;
        int n = s.length();

        int max = maxvow;

        while(j<n){
            if(s.charAt(j)=='a' ||s.charAt(j)=='e' || s.charAt(j)=='i' || s.charAt(j)=='o' || s.charAt(j)=='u'){

                max++;
                


            }
            if(s.charAt(i)=='a' ||s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u'){

                max--;

            }
            i++;
            j++;

            maxvow = Math.max(max, maxvow);

        }
        return maxvow;

        
    }
}