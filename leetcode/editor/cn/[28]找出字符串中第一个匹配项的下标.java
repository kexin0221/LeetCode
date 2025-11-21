package leetcode.editor.cn;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int strStr(String haystack, String needle) {
        if (haystack == null || needle == null) {
            return -1;
        }
        for (int i = 0; i < haystack.length(); i++) {
            if (haystack.charAt(i) == needle.charAt(0)) {
                int hayIndex = i;
                int needleIndex = 0;
                while (needleIndex < needle.length()) {
                    if (haystack.charAt(hayIndex) != needle.charAt(needleIndex)) {
                        return -1;
                    } else {
                        hayIndex++;
                        needleIndex++;
                    }
                }
                return i;
            }
        }
        return -1;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
