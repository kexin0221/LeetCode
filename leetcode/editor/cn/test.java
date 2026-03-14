package leetcode.editor.cn;

import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        // 注意 while 处理多个 case
        int n = in.nextInt();
        int m = in.nextInt();
        long[] arr = new long[n];
        int i = 0;
        while (in.hasNextLong() && i < n) {
            arr[i] = in.nextLong();
            i++;
        }
        while (m > 0) {
            int l = in.nextInt();
            int r = in.nextInt();
            Long[] dp = new Long[n];
            dp[0] = arr[0];
            for (int j = 1; j < dp.length; j++) {
                dp[j] = dp[j-1] + arr[j];
            }
            Long sum;
            if (l == 1) sum = dp[r-1];
            else sum = dp[r-1] - dp[l-2];
            System.out.println(sum);
            m--;
        }
    }
}
