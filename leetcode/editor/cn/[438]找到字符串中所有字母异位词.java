package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> newList = new ArrayList<>();

        if (s.length() < p.length()) {
            return newList;
        }

        int[] pcounts = new int[26];
        int[] scounts = new int[26];

        for (int i = 0; i < p.length(); i++) {
            pcounts[p.charAt(i) - 'a']++;
        }

        for (int i = 0; i < p.length(); i++) {
            scounts[s.charAt(i) - 'a']++;
        }

        int left = 0;
        int right = p.length() - 1;

        if (Arrays.equals(scounts, pcounts)) {
            newList.add(left);
        }

        while (right < s.length() - 1) {
            scounts[s.charAt(left++) - 'a']--;
            scounts[s.charAt(++right) - 'a']++;
            if (Arrays.equals(scounts, pcounts)) {
                newList.add(left);
            }
        }

        return newList;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
