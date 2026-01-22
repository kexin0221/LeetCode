package leetcode.editor.cn;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution11 {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;
        while (left < right) {
            int max = Math.min(height[left], height[right]) * (right - left);
            if (maxArea < max) {
                maxArea = max;
            }
            if (height[left] <= height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxArea;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
