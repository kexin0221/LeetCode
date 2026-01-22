package leetcode.editor.cn;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution202 {

    // 思路：判断链表是否有环（因为一定有环，无需判断），判断快慢指针相遇处的数值是否为1
    // 方法：快慢双指针

    public boolean isHappy(int n) {
        int slow = n;
        int fast = squareSum(n);
        while (slow != fast) {
            slow = squareSum(slow);
            fast = squareSum(squareSum(fast));
        }
        return slow == 1;
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
