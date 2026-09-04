class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int start=1;
        int end=nums[0];
        
        int sum=0;
        int ans=0;
          for(int num:nums){
            end=Math.max(end,num);
        }

        while(start<=end){
            int mid=(start+end)/2;
            sum=0;
           for(int num:nums){
            sum+=(long)(num+mid-1)/mid;
           }
           if (sum<=threshold){
            ans=mid;
            end=mid-1;
           }
           else{
            start=mid+1;
           }
        }
        return ans;
    }
}