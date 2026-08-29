class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer>kk=new HashMap<>();
        for(char c:s.toCharArray()){
                kk.put(c,kk.getOrDefault(c,0)+1);
        }
        PriorityQueue<Map.Entry<Character,Integer>>pq=new PriorityQueue<>(
            (a,b)-> b.getValue()-a.getValue()
        );
        StringBuilder m= new StringBuilder();
        pq.addAll(kk.entrySet());;
       while(!pq.isEmpty()){
Map.Entry<Character,Integer>entry=pq.poll();
m.append(String.valueOf(entry.getKey()).repeat(entry.getValue()));
        }
        return m.toString();
    }
}