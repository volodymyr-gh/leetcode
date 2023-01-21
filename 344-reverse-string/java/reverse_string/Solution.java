package reverse_string;

public class Solution {
    public static void main(String[] args) {
        char[] arr1 = new char[] { 'h', 'e', 'l', 'l', 'o' };
        new Solution().reverseString(arr1);
        assert arr1[0] == 'o';
        assert arr1[1] == 'l';
        assert arr1[2] == 'l';
        assert arr1[3] == 'e';
        assert arr1[4] == 'h';

        char[] arr2 = new char[] { 'H', 'a', 'n', 'n', 'a', 'h' };
        new Solution().reverseString(arr2);
        assert arr2[0] == 'h';
        assert arr2[1] == 'a';
        assert arr2[2] == 'n';
        assert arr2[3] == 'n';
        assert arr2[4] == 'a';
        assert arr2[5] == 'H';
    }

    public void reverseString(char[] s) {
        int i = 0;
        int j = s.length - 1;
        while (i < j) {
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            i++;
            j--;
        }
    }
}