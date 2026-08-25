class MinStack {
private ArrayList<int []>kk;
    public MinStack() {
        kk=new ArrayList <>();
    }
    
    public void push(int value) {
        if (kk.isEmpty()){
kk.add(new int[]{value,value});
        }
        else{
            int curr=kk.get(kk.size()-1)[1];
            kk.add(new int []{value,Math.min(value,curr)});
        }
    }
    
    public void pop() {
        kk.remove(kk.size()-1);
    }
    
    public int top() {
        return kk.get(kk.size()-1)[0];
    }
    
    public int getMin() {
        return kk.get(kk.size()-1)[1];

        
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */