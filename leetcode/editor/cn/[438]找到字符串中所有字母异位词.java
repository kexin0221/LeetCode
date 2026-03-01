package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> newList = new ArrayList<>();
        if (s.length() < p.length()) return newList;
        int[] pcounts = new int[26];
        for (int i = 0; i < p.length(); i++) {
            pcounts[p.charAt(i)-'a']++;
        }
        int[] scounts = new int[26];
        int left = 0, right = left+p.length()-1;
        for (int i = 0; i < p.length(); i++) {
            scounts[s.charAt(i)-'a']++;
        }
        if (Arrays.equals(scounts, pcounts)) {
            newList.add(0);
        }
        for (int i = p.length(); i < s.length(); i++) {
            scounts[s.charAt(i - p.length()) - 'a']--;
            scounts[s.charAt(i) - 'a']++;
            if (Arrays.equals(scounts, pcounts)) {
                newList.add(i - p.length() + 1);
            }
        }
        return newList;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
