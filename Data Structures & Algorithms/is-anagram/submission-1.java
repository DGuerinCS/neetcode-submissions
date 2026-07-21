class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
       HashMap<Character, Integer> countMap = new HashMap<>();
       HashMap<Character, Integer> countMap2 = new HashMap<>();
        for(int i = 0; i < t.length(); i++){
            countMap.put(s.charAt(i), countMap.getOrDefault(s.charAt(i), 0)+1);
            countMap2.put(t.charAt(i), countMap2.getOrDefault(t.charAt(i), 0)+1);
            }
        return countMap.equals(countMap2);
    }
    
}
