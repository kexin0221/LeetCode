package leetcode.editor.cn;

//leetcode submit region begin(Prohibit modification and deletion)
class SolutionLCR179 {
    public int[] twoSum(int[] price, int target) {
        int left = 0, right = price.length - 1;
        int[] ret = new int[2];
        while (left < right) {
            if (price[left] + price[right] < target) {
                left++;
            } else if (price[left] + price[right] > target) {
                right--;
            } else {
                ret[0] = price[left];
                ret[1] = price[right];
                break;
            }
        }
        return ret;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
