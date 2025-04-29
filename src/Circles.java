import java.util.Scanner;

public class Circles {

    public static int findNumberOfPoints(int x1, int r1, int x2, int r2) {
        int distance = Math.abs(x1 - x2);

        if (distance == 0 && r1 == r2) {
            return -1; // Совпадают
        } else if (distance == r1 + r2 || distance == Math.abs(r1 - r2)) {
            return 1; // Касаются
        } else if (Math.abs(r1 - r2) < distance && distance < r1 + r2) {
            return 2; // Пересекаются в двух точках
        } else {
            return 0; // Не пересекаются
        }
    }
}