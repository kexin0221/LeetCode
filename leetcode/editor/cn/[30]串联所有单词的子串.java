package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution30 {
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> newList = new ArrayList<>();
        int len = words[0].length(), m = words.length;
        HashMap<String, Integer> wordsHash = new HashMap<>();
        for (String word : words) {
            wordsHash.put(word, wordsHash.getOrDefault(word, 0)+1);
        }
        for (int i = 0; i < len; i++) {
            HashMap<String, Integer> sHash = new HashMap<>();
            for (int left = i, right = i, count = 0; right + len <= s.length() ; right+=len) {
                String in = s.substring(right, right + len);
                sHash.put(in, sHash.getOrDefault(in, 0) + 1);
                if (sHash.get(in) <= wordsHash.getOrDefault(in, 0)) {
                    count++;
                }
                if (right - left + 1 > len * m) {
                    String out = s.substring(left, left + len);
                    if (sHash.get(out) <= wordsHash.getOrDefault(out, 0)) {
                        count--;
                    }
                    sHash.put(out, sHash.get(out) - 1);
                    left += len;
                }
                if (count == m) newList.add(left);
            }
        }
        return newList;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
