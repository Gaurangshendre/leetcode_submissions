class Solution {
    public int[] nextGreaterElements(int[] nums) {
        ArrayList<Integer> kk = new ArrayList<>();
        int m =0;
        for (int i =0;i<nums.length;i++){
                            Boolean k=false;

            for(int j =1;j<nums.length;j++){
                int index=(i+j)%nums.length;
                if ((nums[i]+1)<=nums[index]){
                    kk.add(nums[index]);
                    k=true;
                    break;
                }
                
                
            }
        if (!k){
            kk.add(-1);
        }
        }
        int[] result = new int[kk.size()];
for (int i = 0; i < kk.size(); i++) {
    result[i] = kk.get(i); 
}
return result;
    }
}