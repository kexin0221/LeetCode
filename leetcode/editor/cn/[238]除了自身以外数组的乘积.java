package leetcode.editor.cn;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution238 {
    public int[] productExceptSelf(int[] nums) {
        int[] answer = new int[nums.length];
        int[] f = new int[nums.length];
        int[] g = new int[nums.length];

        f[0] = g[nums.length - 1] = 1;
        for (int i = 1; i < nums.length; i++) {
            f[i] = f[i-1] * nums[i-1];
        }
        for (int i = nums.length-2; i >= 0; i--) {
            g[i] = g[i+1] * nums[i+1];
        }

        for (int i = 0; i < nums.length; i++) {
            answer[i] = f[i] * g[i];
        }

        return answer;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
