class Solution {
    public int countPrimes(int n) {
        int count=0;
        boolean [] kk= new boolean [n];
        java.util.Arrays.fill(kk,true);
       
    
        for(int i=2;i<n;i++){
           if(kk[i]==true){
            count++;
            if((long) i*i<n){
                for(int j=i*i;j<n;j+=i){
                    kk[j]=false;
                }
            }
           }  
            }
           
        return count;
    }
}