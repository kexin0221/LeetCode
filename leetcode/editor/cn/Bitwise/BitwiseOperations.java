package leetcode.editor.cn.Bitwise;

public class BitwiseOperations {
    // 确定n的二进制表示中的第x位是0还是1
    public int xBit0or1(int n, int x) {
        return (n >> x-1) & 1;
    }

    // 将一个数n的二进制表示的第x位修改成1
    public int xBitTo1(int n, int x) {
        n |= (1 << x-1);
        return n;
    }

    // 将一个数n的二进制表示的第x位修改成0
    public int xBitTo0(int n, int x) {
        n &= ~(1 << x-1);
        return n;
    }

    // 提取一个数(n)二进制表示中最右侧的1
    public int rightMost1(int n) {
        return n & -n;
    }

    // 去掉一个数(n)二进制表示中最右侧的1
    public int minusRightMost1(int n) {
        return n & (n-1);
    }


    // 异或运算律
    // 1.a ^ 0 = a
    // 2.a ^ a = 0
    // 3.a ^ b ^ c = a ^ (b ^ c)
}
