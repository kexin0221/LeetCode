package leetcode.editor.cn;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution283 {
    public void moveZeroes(int[] nums) {
        int left = 0;
        int right = 1;
        while (right < nums.length) {
            if (nums[left] == 0 && nums[right] != 0) {
                int t = nums[left];
                nums[left] = nums[right];
                nums[right] = t;
                left++;
                right++;
            } else if (nums[left] == 0 && nums[right] == 0) {
                right++;
            } else {
                left++;
                right++;
            }
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)
