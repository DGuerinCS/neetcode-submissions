class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s==null || s.length() == 0){
            return 0;
        }
        String[] arr = s.split("");
        Set<String> chars = new HashSet<>(arr.length);
        int l = 0, lengthS = 1;
        for(int r=0;r<arr.length; r++){
            while(chars.contains(arr[r])){
                chars.remove(arr[l]);
                l++;
            }
            if(lengthS<r-l+1){
                lengthS = r-l+1;
            }
            chars.add(arr[r]);
        }
        return lengthS;
    }
}
