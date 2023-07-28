// public static void main(String[] args) throws Exception {
//    try {
//        int a = 90;
//        int b = 3;
//        System.out.println(a / b);
//        printSum(23, 234);
//        int[] abc = { 1, 2 };
//        abc[3] = 9;
//    } catch (Throwable ex) {
//        System.out.println("Что-то пошло не так...");
//    } catch (NullPointerException ex) {
//        System.out.println("Указатель не может указывать на null!");
//    } catch (IndexOutOfBoundsException ex) {
//        System.out.println("Массив выходит за пределы своего размера!");
//    }
// }
// public static void printSum(Integer a, Integer b) throws FileNotFoundException {
//    System.out.println(a + b);
// }

// Код написан некоректно. В блоке catch(Throwable ex) уже ловятся исключения NullPointerExcetion и
// IndexOutBoundsException. Исключение NullPointerExcetion не имеет отношения к тому, что происходит в блоке try. 
// Так же метод printSum объявлен с генерированием ислючения FileNotFoundExeption, но в методе не предусмотрена 
// работа с файлами.


// Корректный код:

// public static void main(String[] args) throws Exception {
//    try {
//        int a = 90;
//        int b = 3;
//        System.out.println(a / b);
//        printSum(23, 234);
//        int[] abc = { 1, 2 };
//        abc[3] = 9;
//     } catch (ArithmeticException ex) {
//        System.out.println("Ошибка: деление на ноль");
    
//     } catch (IndexOutOfBoundsException ex) {
//        System.out.println("Массив выходит за пределы своего размера!");
//     }
// }
// public static void printSum(Integer a, Integer b) {
//    System.out.println(a + b);
// }