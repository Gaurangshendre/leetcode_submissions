class Solution {
    public int beautySum(String s) {
        int count=0;
        for (int i =0;i<s.length();i++){
             HashMap<Character,Integer>kk=new HashMap<>();
            for(int j =i;j<s.length();j++){
                
                char c =s.charAt(j);
       
        
            kk.put(c,kk.getOrDefault(c,0)+1);
        
        int maxi=0;
       int  mini=s.length();
        for(int val:kk.values()){
            maxi=Math.max(maxi,val);
            mini=Math.min(mini,val);
        }
        count=count+(maxi-mini);
            }
        }
        return count;
    }
}