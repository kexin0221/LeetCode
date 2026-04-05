package leetcode.editor.cn;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution75 {
    public void sortColors(int[] nums) {
        int left = -1, right = nums.length;
        for (int i = 0; i < right;) {
            if (nums[i] == 0) {
                swap(nums, ++left, i++);
            } else if (nums[i] == 1) {
                i++;
            } else {
                swap(nums, --right, i);
            }
        }
    }

    public void swap(int[] arr, int a, int b) {
        int tmp = arr[a];
        arr[a] = arr[b];
        arr[b] = tmp;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
