class Solution {
    public double findMaxAverage(int[] arr, int k) {

        double firstsum = 0;

        for(int ite = 0; ite<k; ite++){
            firstsum = firstsum + arr[ite];
        }
        double favg = firstsum/k;

        int i =0;
        int j =k;
        double avg = favg;


        while(j<arr.length){

            firstsum = firstsum - arr[i] + arr[j];

            i++;
            j++;

            double newavg = firstsum/k;

            avg = Math.max(avg,newavg);

        }
        return avg;
        
    }
}