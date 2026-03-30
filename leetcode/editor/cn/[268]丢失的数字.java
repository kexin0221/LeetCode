package leetcode.editor.cn;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution268 {
    public int missingNumber(int[] nums) {
        // 异或运算律
        int num1 = 0, num2 = 0;
        for (int num : nums) {
            num1 ^= num;
        }
        for (int i = 0; i <= nums.length; i++) {
            num2 ^= i;
        }
        return num1 ^ num2;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
