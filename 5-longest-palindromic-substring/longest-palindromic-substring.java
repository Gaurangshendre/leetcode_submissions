class Solution {
    public String longestPalindrome(String s) {
        String ans="";
        for(int i=0;i<s.length();i++){
            for(int j =i;j<s.length();j++){
                int left=0;
                String k=s.substring(i,j+1);
                int right=k.length()-1;
                boolean pali=true;
                while(left<right) {
                    if(k.charAt(left)!=k.charAt(right)){
                        pali=false;
                        break;
                    }
                    left++;
                    right--;
                }
                if (pali&& k.length() > ans.length()) {
                    ans = k;
                }
            }
        }
        return  ans;
    }
}