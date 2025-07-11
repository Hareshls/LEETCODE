import java.util.Arrays;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] map = new int[256]; 
        Arrays.fill(map, -1);
        int length = 0, left = 0, right = 0, n = s.length();

        while (right < n) {
            
            if (map[s.charAt(right)] != -1) {
                left = Math.max(map[s.charAt(right)] + 1, left);
            }
          
            map[s.charAt(right)] = right;
            length = Math.max(length, right - left + 1);
            right++;
        }
        return length;
    }
}