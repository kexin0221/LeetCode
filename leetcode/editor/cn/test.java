package leetcode.editor.cn;

import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 3, 4, 5};
        Solution solution = new Solution();
        int i = solution.minSubArrayLen(11, a);
        System.out.println(i);
    }
}
