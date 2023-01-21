package first_bad_version;

public class Solution {
    public static void main(String[] args) {
        int res1 = new VersionControl(new int[] { 4 }).firstBadVersion(5);
        assert res1 == 4;

        int res2 = new VersionControl(new int[] { 1 }).firstBadVersion(1);
        assert res2 == 1;

        int res3 = new VersionControl(new int[] { 1702766719 }).firstBadVersion(2126753390);
        assert res3 == 1702766719;
    }
}

class VersionControl {
    private final int[] badVersions;

    VersionControl(int[] badVersions) {
        this.badVersions = badVersions;
    }

    boolean isBadVersion(int version) {
        for (int bad : badVersions) {
            if (version == bad) {
                return true;
            }
        }
        return false;
    }

    int firstBadVersion(int n) {
        int low = 1;
        int high = n;

        while (low <= high) {
            int mid = low + ((high - low) / 2);
            if (isBadVersion(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }
}
