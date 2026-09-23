class Solution {
    public int lengthOfLongestSubstring(String s) {
    
    HashMap<Character,Integer>kk=new HashMap<>();
    int maxLen =0;
    int left=0;
    char []array = s.toCharArray();
    for(int i=0;i<array.length;i++){
        char ch =array[i];
        kk.put(ch,kk.getOrDefault(ch,0)+1);
while(kk.get(ch)==2){
    char leftchar = array[left];
    kk.put(leftchar,kk.get(leftchar)-1);
    left++;
}
maxLen=Math.max(maxLen,i-left+1);
    }
    return maxLen;
    }
}