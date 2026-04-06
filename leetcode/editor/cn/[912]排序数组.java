package leetcode.editor.cn;

import java.util.Random;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution912 {
    public int[] sortArray(int[] nums) {
        qsort(nums, 0, nums.length-1);
        return nums;
    }

    public void qsort(int[] nums, int l, int r) {
        if (l >= r) return;
        int key = nums[new Random().nextInt(r - l + 1) + l];
        int left = l - 1, right = r + 1, i = l;
        while (i < right) {
            if (nums[i] < key) swap(nums, ++left, i++);
            else if (nums[i] > key) swap(nums, --right, i);
            else i++;
        }
        qsort(nums, l, left);
        qsort(nums, right, r);
    }

    public void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
