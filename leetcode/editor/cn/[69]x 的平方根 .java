package leetcode.editor.cn;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution69 {
    public int mySqrt(int x) {
        if (x < 1) {
            return 0;
        }
        long left = 1, right = x;
        while (left < right) {
            long mid = left + (right - left + 1) / 2;
            if (mid * mid <= x) {
                left = mid;
            } else {
                right = mid - 1;
            }
        }
        return (int)left;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
