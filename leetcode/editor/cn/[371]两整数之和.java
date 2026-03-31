package leetcode.editor.cn;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution371 {
    public int getSum(int a, int b) {
        while (b != 0) {
            int t = a ^ b;
            b = (a & b) << 1;
            a = t;
        }
        return a;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
