package leetcode.editor.cn;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public void duplicateZeros1089(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == 0) {
                for (int j = arr.length - 2; j >= i + 1 ; j--) {
                    arr[j + 1] = arr[j];
                }
                arr[++i] = 0;
            }
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)
