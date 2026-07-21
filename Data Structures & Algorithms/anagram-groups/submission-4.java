class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
         Map<String, List<String>> charFreq = new HashMap<>();
         for(String s: strs){
            int[] count = new int[26];
            for(char c : s.toCharArray()){
                count[c - 'a']++;
            }
            String keypair = Arrays.toString(count);
            charFreq.putIfAbsent(keypair, new ArrayList<>());
            charFreq.get(keypair).add(s);
         }
         return new ArrayList<>(charFreq.values());
    }
}
