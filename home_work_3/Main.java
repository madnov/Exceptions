package home_work_3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean flag = true;
        Scanner scanner = new Scanner(System.in, "cp866");
        while (flag) {
            System.out.println(
                    "Введите данные в формате: Фамилия Имя Отчество дата рождения(dd.mm.yyyy) номер телефона пол(fm)");
            String input = scanner.nextLine();
            String[] data = input.split(" ");

            if (data.length != 6) {
                System.out.println(
                        "Ошибка: введено неверное количество данных\nВведите данные в формате: Фамилия Имя Отчество дата рождения(dd.mm.yyyy) номер телефона пол(fm)");
                input = scanner.nextLine();
            }
            if (data.length == 6) {
                String lastName = data[0];
                String firstName = data[1];
                String middleName = data[2];
                String birthDate = data[3];
                String phoneNumber = data[4];
                String gender = data[5];
                try {
                    validateData(lastName, firstName, middleName, birthDate, phoneNumber, gender);

                    File file = new File("home_work_3\\" + lastName + ".txt");
                    FileWriter writer = new FileWriter(file, true);
                    writer.write(
                            lastName + " " + firstName + " " + middleName + " " + birthDate + " " + phoneNumber + " "
                                    + gender + "\n");
                    writer.close();

                    System.out.println("Данные успешно записаны в файл " + file.getName());
                } catch (IllegalArgumentException | IOException e) {
                    System.out.println(e.getMessage());
                }
                flag = false;
            }
        }
    }

    private static void validateData(String lastName, String firstName, String middleName, String birthDate,
            String phoneNumber, String gender) throws IllegalArgumentException {
        if (!lastName.matches("[a-zA-Zа-яА-Я]+")) {
            throw new IllegalArgumentException("Ошибка: фамилия должна состоять только из букв");
        }
        if (!firstName.matches("[a-zA-Zа-яА-Я]+")) {
            throw new IllegalArgumentException("Ошибка: имя должно состоять только из букв");
        }
        if (!middleName.matches("[a-zA-Zа-яА-Я]+")) {
            throw new IllegalArgumentException("Ошибка: отчество должно состоять только из букв");
        }
        if (!birthDate.matches("\\d{2}.\\d{2}.\\d{4}")) {
            throw new IllegalArgumentException("Ошибка: неверный формат даты рождения, используйте формат dd.mm.yyyy");
        }
        try {
            Long.parseLong(phoneNumber);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Ошибка: номер телефона должен быть целым числом без знака");
        }
        if (!gender.matches("[fm]")) {
            throw new IllegalArgumentException("Ошибка: пол должен быть указан символом f или m");
        }
    }
}
