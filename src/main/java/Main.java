import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите x1: ");
        int x1 = scanner.nextInt();

        System.out.print("Введите r1: ");
        int r1 = scanner.nextInt();

        System.out.print("Введите x2: ");
        int x2 = scanner.nextInt();

        System.out.print("Введите r2: ");
        int r2 = scanner.nextInt();

        int result = Circles.findNumberOfPoints(x1, r1, x2, r2);

        if (result == -1) {
            System.out.println("Окружности совпадают: бесконечно много общих точек.");
        } else {
            System.out.println("Количество общих точек: " + result);
        }
    }
}