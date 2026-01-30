package leetcode.editor.cn;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution3 {
    public int lengthOfLongestSubstring(String s) {
        char[] arr = s.toCharArray();
        int ret = 0, n = arr.length;
        int[] hash = new int[128]; // ASCII码当做数组下标
        int left = 0, right = 0;
        while (right < n) {
            hash[arr[right]]++;
            while (hash[arr[right]] > 1) {
                hash[arr[left++]]--;
            }
            ret = Math.max(ret, right - left + 1);
            right++;
        }
        return ret;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
