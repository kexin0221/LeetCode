package leetcode.editor.cn;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution560 {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        for (int l = 0; l < nums.length; l++) {
            int sum = nums[l];
            if (sum == k) count++;
            if (l+1 < nums.length) {
                for (int r = l+1; r < nums.length; r++) {
                    sum += nums[r];
                    if (sum == k) count++;
                }
            }
        }
        return count;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
