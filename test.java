import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        //把数组中的值为4的数删掉
        int[] nums = {1, 2, 3, 4, 4, 5};
        int i = 0;
        int len = nums.length;
        while(i < len) {
            if (nums[i] == 4) {
                for (int j = i; j < len - 1; j++) {
                    nums[j] = nums[j + 1];
                }
                len--;
            } else {
                i++;
            }
        }
        nums = Arrays.copyOf(nums, len);
        System.out.println(Arrays.toString(nums));
    }
}
