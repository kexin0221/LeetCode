package leetcode.editor.cn;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] answer = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            answer[i] = 1;
            for (int j = 0; j < nums.length; j++) {
                if (i != j) {
                    answer[i] *= nums[j];
                }
            }
        }
        return answer;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
