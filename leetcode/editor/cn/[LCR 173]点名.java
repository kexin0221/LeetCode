package leetcode.editor.cn;

//leetcode submit region begin(Prohibit modification and deletion)
class SolutionLCR173 {
    public int takeAttendance(int[] records) {
        if (records[0] == 1) return 0;
        for (int i = 0; i < records.length; i++) {
            if (records[i] != i) {
                return i;
            }
        }
        return records.length;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
