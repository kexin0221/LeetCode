package leetcode.editor.cn;

import java.util.HashMap;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution974 {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        hashMap.put(0, 1);
        int sum = 0, ret = 0;
        for (int num : nums) {
            sum += num;
            int r = (sum % k + k) % k;
            ret += hashMap.getOrDefault(r,0);
            hashMap.put(r, hashMap.getOrDefault(r, 0) + 1);
        }
        return ret;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
