class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer>kk=new HashMap<>();
        for (int i =0;i<nums.length;i++){
            if(kk.containsKey(nums[i])){
                return true;
            }
            kk.put(nums[i],i);
        }
        return false;
    }
}