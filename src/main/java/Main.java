import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x1 = readInt(scanner, "Введите x1: ");
        int r1 = readInt(scanner, "Введите r1: ");
        int x2 = readInt(scanner, "Введите x2: ");
        int r2 = readInt(scanner, "Введите r2: ");

        int result = Circles.findNumberOfPoints(x1, r1, x2, r2);

        if (result == -1) {
            System.out.println("Окружности совпадают: бесконечно много общих точек.");
        } else {
            System.out.println("Количество общих точек: " + result);
        }
    }

    private static int readInt(Scanner scanner, String message) {
        System.out.print(message);
        try {
            return scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Ошибка: введите целое число!");
            System.exit(1);
            return -1;
        }
    }
}
