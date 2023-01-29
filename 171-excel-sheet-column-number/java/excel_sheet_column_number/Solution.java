package excel_sheet_column_number;

public class Solution {
    public static void main(String[] args) {
        int res1 = new Solution().titleToNumber("A");
        assert res1 == 1;

        int res2 = new Solution().titleToNumber("AB");
        assert res2 == 28;

        int res3 = new Solution().titleToNumber("ZY");
        assert res3 == 701;
    }

    public int titleToNumber(String columnTitle) {
        int len = columnTitle.length();
        int res = 0;
        for (int i = 0; i < len ; i++) {
            int charPos = len - 1 - i;
            int num = columnTitle.charAt(charPos) - 64;
            res += num * Math.pow(26, i);
        }

        return res;
    }
}
