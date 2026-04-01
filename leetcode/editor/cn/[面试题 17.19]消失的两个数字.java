package leetcode.editor.cn;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution1719 {
    public int[] missingTwo(int[] nums) {
        int tmp = 0;
        for (int num : nums) {
            tmp ^= num;
        }
        for (int i = 1; i <= nums.length + 2; i++) {
            tmp ^= i;
        }
        int diff = 0;
        while (true) {
            if (((tmp >> diff) & 1) == 1) break;
            else diff++;
        }

        int[] ret = new int[2];
        for (int num : nums) {
            if (((num >> diff) & 1) == 1) ret[1] ^= num;
            else ret[0] ^= num;
        }
        for (int i = 1; i <= nums.length + 2 ; i++) {
            if (((i >> diff) & 1) == 1) ret[1] ^= i;
            else ret[0] ^= i;
        }
        return ret;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
