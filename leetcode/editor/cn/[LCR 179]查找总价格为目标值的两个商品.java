package leetcode.editor.cn;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] twoSum(int[] price, int target) {
        int left = 0, right = price.length - 1;
        while (left < right) {
            if (price[left] + price[right] < target) {
                left++;
            } else if (price[left] + price[right] > target) {
                right--;
            } else {
                return new int[]{price[left], price[right]};
            }
        }
        return null;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
