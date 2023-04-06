package DenisenkoDV_Java;

import java.util.Arrays;
import java.util.Scanner;

/*
Denisenko Dmitriy (18.08.2022)
 */
public class App {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        digit();
        name();
        createArray100();
        toClose();
    }

    // Если введенное число больше 7, то вывести “Привет”
    static void digit() {
        System.out.println("Введите число");
        int number = scanner.nextInt();
        String s = (number > 7) ? "Привет" : "Число меньше 7, привета не будет";
        System.out.println("Вы ввели число " + number + ", ответ на это: " + s);
        System.out.println();
    }

    //Если введенное имя совпадает с Вячеслав, то вывести “Привет, Вячеслав”, если нет, то вывести "Нет такого имени"
    static void name() {
        String reqiuredName = "Вячеслав";
        String reqiuredName2 = "Vyacheslav";
        System.out.println("Введите имя. Если из среды разработки, то по русски: Вячеслав. Если из jar файла в консоли то по английски: Vyacheslav");
        String enteredName = scanner.next();
        String s = (enteredName.equals(reqiuredName) || enteredName.equals(reqiuredName2)) ? "Привет, Вячеслав" : "Нет такого имени";
        System.out.println(s);
        System.out.println();
    }

    //На входе есть числовой массив, необходимо вывести элементы массива кратные 3
    static void createArray100() {
        int array[] = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        System.out.println("Имеется массив: ");
        System.out.println(Arrays.toString(array));
        System.out.println();
        System.out.println("Выводим элементы массива кратные 3: ");
        for (int j : array) {
            if ((j % 3) == 0) {
                System.out.print(j + " ");
            }
        }
    }

    static void toClose() {
        System.out.println();
        System.out.println("Чтобы закрыть консольное приложение введите любой символ и нажмите enter ");
        String a = scanner.next();
    }
}
