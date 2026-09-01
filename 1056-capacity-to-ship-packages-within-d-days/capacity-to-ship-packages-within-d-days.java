class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int maxweight=-1,total=0;
        for(int weight:weights){
            maxweight=Math.max(maxweight,weight);
            total=total+weight;
        }
        while(maxweight<total){
int current=0;
int day=1;
int midweight=(maxweight+total)/2;
for(int weight:weights){
    if(weight+current>midweight){
        day++;
        current=0;
    }
    current=current+weight;
}
if(day>days){
    maxweight=midweight+1;
}
else{
    total=midweight;
}
        }
        return maxweight;
    }
}