package leetcode.editor.cn;

import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 3, 4, 5};
        int i = Arrays.stream(a).sum();
        System.out.println(i);
    }
}
