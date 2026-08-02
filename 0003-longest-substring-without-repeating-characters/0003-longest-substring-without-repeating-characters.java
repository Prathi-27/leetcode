import java.util.HashSet;

class Solution {
    public int lengthOfLongestSubstring(String s) {

        HashSet<Character> h = new HashSet<>();

        int left = 0;
        int max = 0;

        for (int i = 0; i < s.length(); i++) {

            while (h.contains(s.charAt(i))) {
                h.remove(s.charAt(left));
                left++;
            }

            h.add(s.charAt(i));

            max = Math.max(max, i - left + 1);
        }

        return max;
    }
}