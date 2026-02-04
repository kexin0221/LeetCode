package leetcode.editor.cn;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int totalFruit(int[] fruits) {
        if (fruits.length == 1 || fruits.length == 2) return fruits.length;
        int maxLength = 2;
        int left = 0, right = 1;
        while (right+1 < fruits.length) {
            while (fruits[left] == fruits[right]) {
                right++;
                maxLength++;
            }
            if (fruits[right+1] == fruits[right] || fruits[right+1] == fruits[left]) {
                right++;
                maxLength++;
            } else {
                left++;right++;
            }
        }
        return maxLength;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
