package leetcode.editor.cn;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean isHappy(int n) {
        int count = 0;
        while (n > 0) {
            n = squareSum(n);
            count++;
            if (n == 1) {
                return true;
            }
            if (count > 1000) {
                break;
            }
        }
        return false;
    }

    private int squareSum(int n) {
        int sum = 0;
        while (n > 0) {
            int bit = n % 10;
            sum += bit * bit;
            n /= 10;
        }
        return sum;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
