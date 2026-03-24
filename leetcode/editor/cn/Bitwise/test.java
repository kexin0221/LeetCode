package leetcode.editor.cn.Bitwise;

public class test {
    public static void main(String[] args) {
        BitwiseOperations bitwiseOperations = new BitwiseOperations();
        for (int i = 8; i > 0; i--) {
            System.out.print(bitwiseOperations.xBit0or1(100, i));
        }
        System.out.println();
        int num1 = bitwiseOperations.xBitTo1(100, 5);
        for (int i = 8; i > 0; i--) {
            System.out.print(bitwiseOperations.xBit0or1(num1, i));
        }
        System.out.println();
        int num2 = bitwiseOperations.xBitTo0(100, 3);
        for (int i = 8; i > 0; i--) {
            System.out.print(bitwiseOperations.xBit0or1(num2, i));
        }
        System.out.println();
        int num3 = bitwiseOperations.rightMost1(100);
        for (int i = 8; i > 0; i--) {
            System.out.print(bitwiseOperations.xBit0or1(num3, i));
        }
        System.out.println();
        int num4 = bitwiseOperations.minusRightMost1(100);
        for (int i = 8; i > 0; i--) {
            System.out.print(bitwiseOperations.xBit0or1(num4, i));
        }
    }
}
