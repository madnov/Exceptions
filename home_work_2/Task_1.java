
import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        String number;
        boolean flag = true;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите дробное число: ");
        number = scanner.nextLine();

        while (flag) {
            try {
                float num = Float.parseFloat(number);
                System.out.println("Вы ввели: " + number);
                flag = false;
            } catch (NumberFormatException e) {
                System.out.print("Вы ввели не число попробуйте ещё раз: ");
                number = scanner.nextLine();
            }
        }
    }
}
