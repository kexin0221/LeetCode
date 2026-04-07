package leetcode.editor.cn;

import java.util.EnumSet;

//leetcode submit region begin(Prohibit modification and deletion)
class SolutionLCR170 {
    int[] tmp;
    public int reversePairs(int[] record) {
        tmp = new int[record.length];
        return mergeSort(record, 0, record.length-1);
    }

    private int mergeSort(int[] nums, int left, int right) {
        if (left >= right) return 0;
        int ret = 0;
        int mid = (left + right) / 2;
        ret += mergeSort(nums, left, mid);
        ret += mergeSort(nums, mid + 1, right);

        int cur1 = left, cur2 = mid + 1, i = 0;
        while (cur1 <= mid && cur2 <= right) {
            if (nums[cur1] <= nums[cur2]) {
                tmp[i++] = nums[cur1++];
            } else {
                ret += mid - cur1 + 1;
                tmp[i++] = nums[cur2++];
            }
        }

        while (cur1 <= mid) tmp[i++] = nums[cur1++];
        while (cur2 <= right) tmp[i++] = nums[cur2++];
        if (right + 1 - left >= 0) {
            System.arraycopy(tmp, 0, nums, left, right + 1 - left);
        }
        return ret;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
