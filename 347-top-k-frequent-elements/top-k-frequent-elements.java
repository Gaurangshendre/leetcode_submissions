class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer>kk=new HashMap<>();
        for (int i : nums){
            kk.put(i,kk.getOrDefault(i,0)+1);
        }
       PriorityQueue <Integer>pq = new PriorityQueue<>(
         (a, b) -> kk.get(b) - kk.get(a)
       );
       pq.addAll(kk.keySet());
       int [] result = new int [k];
       for (int i =0;i<k;i++){
        result[i]=pq.poll();
       }
       return result;
    }
}