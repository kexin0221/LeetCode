package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> newList = new ArrayList<>();
        int[] pcounts = new int[26];
        for (int i = 0; i < p.length(); i++) {
            pcounts[p.charAt(i)-97]++;
        }
        int[] scounts = new int[26];
        int left = 0, right = left+p.length()-1;
        while (right < s.length()) {
            while (left < right) {
                scounts[s.charAt(left)-97]++;
                left++;
            }
            if (Arrays.equals(scounts, pcounts)) {
                newList.add(right-p.length()+1);
            }
        }
        return newList;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
