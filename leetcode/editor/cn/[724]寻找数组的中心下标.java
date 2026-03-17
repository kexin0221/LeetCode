package leetcode.editor.cn;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution724 {
    public int pivotIndex(int[] nums) {
        int sumArray = 0;
        for (int num : nums) {
            sumArray += num;
        }
        if (sumArray - nums[0] == 0) return 0;
        int index = 1;
        int leftSum = nums[0];
        int rightSum = sumArray - nums[0] - nums[1];
        while (index < nums.length-1) {
            if (leftSum == rightSum) return index;
            leftSum += nums[index];
            rightSum -= nums[index+1];
            index++;
        }
        if (sumArray - nums[nums.length-1] == 0) return nums.length-1;
        return -1;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
