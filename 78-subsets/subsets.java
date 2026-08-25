class Solution {
    public List<List<Integer>> subsets(int[] nums) {
    List<List<Integer>>kk=new ArrayList<>();
    List<Integer>m=new ArrayList<>();
    
   
    backtrack(0,m,kk,nums);
    return kk;
    }
     private void backtrack(int index, List<Integer>m, List<List<Integer>>kk,int[]nums){
        kk.add(new ArrayList<>(m));
        for(int i =index;i<nums.length;i++){
            m.add(nums[i]);
            backtrack(i+1,m,kk,nums);
            m.remove(m.size()-1);
        }
        
    }
    
}