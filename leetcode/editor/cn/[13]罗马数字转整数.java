package leetcode.editor.cn;

import java.util.HashMap;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution13 {
    public int romanToInt(String s) {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        hashMap.put('I', 1);
        hashMap.put('V', 5);
        hashMap.put('X', 10);
        hashMap.put('L', 50);
        hashMap.put('C', 100);
        hashMap.put('D', 500);
        hashMap.put('M', 1000);
        int num = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (i + 1 < s.length()) {
                char cNext = s.charAt(i+1);
                if (hashMap.get(cNext) > hashMap.get(c)) {
                    num += hashMap.get(cNext) - hashMap.get(c);
                    i++;
                    continue;
                }
            }
            num += hashMap.get(c);
        }
        return num;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
