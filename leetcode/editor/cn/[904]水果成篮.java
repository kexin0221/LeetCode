package leetcode.editor.cn;

import java.util.HashMap;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int totalFruit(int[] fruits) {
        if (fruits.length == 1 || fruits.length == 2) return fruits.length;
        int ret = 0;
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int left = 0, right = 0; right < fruits.length; right++) {
            hashMap.put(fruits[right], hashMap.getOrDefault(fruits[right], 0) + 1);
            if (hashMap.size() > 2) {
                // 出窗口
                hashMap.put(fruits[left], hashMap.get(fruits[left])-1);
                if (hashMap.get(fruits[left]) == 0) {
                    hashMap.remove(fruits[left]);
                }
                left++;
            }
            ret = Math.max(ret, right - left + 1);
        }
        return ret;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
