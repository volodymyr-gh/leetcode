package excel_sheet_column_title;

public class Solution {
    public static void main(String[] args) {
        String res1 = new Solution().convertToTitle(1);
        assert res1.equals("A");

        String res2 = new Solution().convertToTitle(28);
        assert res2.equals("AB");

        String res3 = new Solution().convertToTitle(701);
        assert res3.equals("ZY");

        String res4 = new Solution().convertToTitle(838);
        assert res4.equals("AFF");

        String res5 = new Solution().convertToTitle(52);
        assert res5.equals("AZ");

        String res6 = new Solution().convertToTitle(8918);
        assert res6.equals("MDZ");

        String res7 = new Solution().convertToTitle(3393);
        assert res7.equals("DZM");

        String res8 = new Solution().convertToTitle(17918);
        assert res8.equals("ZMD");
    }

    public String convertToTitle(int columnNumber) {
        StringBuilder res = new StringBuilder();
        while (columnNumber > 0) {
            int rem = (columnNumber - 1) % 26;
            res.append((char) (65 + rem));
            columnNumber = (columnNumber - 1) / 26;
        }

        return res.reverse().toString();
    }
}
