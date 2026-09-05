class Solution {
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        int[] count_s = new int[26];
        int[] count_t = new int[26];

        for (int i = 0; i < s.length(); i++) {
            count_s[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i < t.length(); i++) {
            count_t[t.charAt(i) - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            if (count_s[i] != count_t[i]) {
                return false;
            }
        }

        return true;
    }
}