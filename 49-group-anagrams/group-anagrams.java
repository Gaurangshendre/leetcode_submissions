class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
HashMap<String,List<String>>kk = new HashMap<>();

        for(String s :strs){
            char [] chars= s.toCharArray();
            
            Arrays.sort(chars);
            String sortedKey = new String(chars);
            if (!kk.containsKey(sortedKey)){
                kk.put(sortedKey,new ArrayList<>());
               
            }
            kk.get(sortedKey).add(s);;
        }
        return new ArrayList<>(kk.values());
    }
}