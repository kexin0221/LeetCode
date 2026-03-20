package leetcode.editor.cn;

import java.util.HashMap;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution525 {
    public int findMaxLength(int[] nums) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        hashMap.put(0, -1);
        int sum = 0, ret = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += (nums[i] == 0 ? -1 : 1);
            if (hashMap.containsKey(sum)) {
                ret = Math.max(ret, i - hashMap.get(sum));
            } else {
                hashMap.put(sum, i);
            }
        }
        return ret;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
