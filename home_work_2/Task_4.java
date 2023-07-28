package home_work_1;

import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String input = scanner.nextLine();
        if (input.isEmpty()) {
            throw new Exception("Пустые строки вводить нельзя!");
        } else {
            System.out.println("Вы ввели: " + input);
        }
    }
}




