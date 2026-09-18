class Solution {
    public int sumSubarrayMins(int[] arr) {
        Stack<Integer> kk=new Stack<>();
        long sum=0;
        int [] left = new int[arr.length];
        int [] right = new int [arr.length];
        long MOD = 1000000007;
        int n=arr.length;
        for(int i=0;i<n;i++){
            while(!kk.isEmpty() && arr[kk.peek()]>=arr[i]){
                kk.pop();
            }
            if(kk.isEmpty()){
                left[i]=-1;
            }
            else{
                left[i]=kk.peek();

            }
            kk.push(i);
        }
        kk.clear();
        for(int i=n-1;i>=0;i--){
            while(!kk.isEmpty() && arr[kk.peek()]>arr[i]){
                kk.pop();
            }
            if(kk.isEmpty()){
                right[i]=n;
            }
            else{
                right[i]=kk.peek();

            }
            kk.push(i);
        }
        for (int i=0;i<n;i++){
            long leftc=i-left[i];
            long rightc=right[i]-i;
            sum=(sum+(long)arr[i]*leftc%MOD*rightc)%MOD;
        }
        return (int)sum;

    }
}