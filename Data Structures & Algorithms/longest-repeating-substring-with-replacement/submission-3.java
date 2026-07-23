class Solution {
    public int characterReplacement(String s, int k) {
        HashSet<Character> charSet = new HashSet<>();
        for (char c : s.toCharArray()) {
            charSet.add(c);
        }
        int longest =0;
        for(char ch:charSet){
            int count =0;
            int l = 0;
            for(int right =0;right<s.length();right++){
                if(s.charAt(right)==ch){
                    count++;
                }
                while((right -l +1) - count> k){
                    if(s.charAt(l)==ch){
                        count--;
                    }
                    l++;
                }
                longest = Math.max(longest, right-l+1);
            }
        }
        return longest;
    }
}
