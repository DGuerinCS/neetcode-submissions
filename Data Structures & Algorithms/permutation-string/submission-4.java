class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }
        int[] s1C = new int[26];
        int[] s2C = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            s1C[s1.charAt(i) - 'a']++;
            s2C[s2.charAt(i) - 'a']++;
        }
        int match = 0;
        for (int i = 0; i < 26; i++) {
            if (s1C[i] == s2C[i]) {
                match++;
            }
        }
            if (match == 26) {
                return true;
            }
        int l = 0;
        for (int r = s1.length(); r < s2.length(); r++) {
            int add = s2.charAt(r) - 'a';
            if (s1C[add] == s2C[add]) {
                match--;
            }
            s2C[add]++;
            if (s1C[add] == s2C[add]) {
                match++;
            }
            int remove = s2.charAt(l) - 'a';

            if (s1C[remove] == s2C[remove]) {
                match--;
            }

            s2C[remove]--;

            if (s1C[remove] == s2C[remove]) {
                match++;
            }
            if (match == 26) {
                return true;
            }
            l++;
        }
        return false;
    }
}
