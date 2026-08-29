class Solution {
    public int maxDepth(String s) {
      int depth=0;
      ArrayList<Integer>kk=new ArrayList<>();
      for(char c:s.toCharArray()){
        if (c=='('){
            depth++;
        }
        kk.add(depth);
        if(c==')'){
            depth--;
        }
      } 
      return Collections.max(kk);
    }
}