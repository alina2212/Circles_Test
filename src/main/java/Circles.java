public class Circles {
    public static int findNumberOfPoints(int x1, int r1, int x2, int r2) {
        int d = Math.abs(x1 - x2);
        int sum = r1 + r2;
        int diff = Math.abs(r1 - r2);

        if (d == 0 && r1 == r2) {
            return -1;
        } else if (d == sum || d == diff) {
            return 1;
        } else if (diff < d && d < sum) {
            return 2;
        } else {
            return 0;
        }
    }
}
