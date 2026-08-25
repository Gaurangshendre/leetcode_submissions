class Solution {
    public List<String> generateParenthesis(int n) {
        List<String>kk=new ArrayList<>();
        dfs(0,0,n,"",kk);
        return kk;
        
    }
    public void dfs(int close,int open, int n ,String s,List<String> kk){
        if(close==open && close+open==n*2){
            kk.add(s);
        }
        if(open<n){
            dfs(close,open+1,n,s+'(',kk);
        }
        if(close<open){
            dfs(close+1,open,n,s+')',kk);
        }
    
    
    }
    }
