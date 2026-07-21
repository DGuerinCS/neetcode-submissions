class Solution {
    public boolean isAnagram(String s, String t) {
       HashMap<Character, Integer> countMap = new HashMap<>();
       for(char ch : s.toCharArray()){
            countMap.put(ch, countMap.getOrDefault(ch, 0)+1);
       }
       HashMap<Character, Integer> countMap2 = new HashMap<>();
 for(char ch : t.toCharArray()){
            countMap2.put(ch, countMap2.getOrDefault(ch, 0)+1);
       }
        if(countMap.equals(countMap2)){
            return true;
        }
        return false;
    }
    
}
