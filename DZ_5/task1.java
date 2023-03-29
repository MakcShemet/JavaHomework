/* Реализуйте структуру телефонной книги с помощью HashMap, учитывая,
что 1 человек может иметь несколько телефонов.
Добавить функции 1) Добавление номера
2) Вывод всего
Пример:
Я ввожу: 1
К: Введите фамилию
Я: Иванов
К: Введите номер
Я: 1242353
К: Введите 1) Добавление номера
2) Вывод всего
Я ввожу: 1
К: Введите фамилию
Я: Иванов
К: Введите номер
Я: 547568
К: Введите 1) Добавление номера
2) Вывод всего
Я: 2
Иванов: 1242353, 547568 */

package DZ_5;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Map<String, LinkedList<String>> phonesBook = new HashMap<>();
        Scanner iScanner = new Scanner(System.in);
        String str = "Выберите необходимый пункт меню:\n 1 - Добавление номера\n 2 - Вывод всего\n 0 - выход";
        System.out.println(str);
        int nav = iScanner.nextInt();
        if (nav != 0) {
            for (int i = nav; i != 0; i = iScanner.nextInt()) {
                switch (i) {
                    case 1:
                        System.out.println("Введите фамилию: ");
                        String surname = iScanner.next();
                        System.out.println("Введите телефон: ");
                        String phone = iScanner.next();
                        if (phonesBook.containsKey(surname)) {
                            phonesBook.get(surname).add(phone);
                        } else {
                            LinkedList<String> phones = new LinkedList<>();
                            phones.add(phone);
                            phonesBook.put(surname, phones);
                        }
                        break;
                    case 2:
                        for (var item : phonesBook.entrySet()) {
                            System.out.println(
                                    item.getKey() + ": " + item.getValue().toString().replaceAll("[ \\[ \\] ]", ""));
                        }
                        break;
                    default:
                        System.out.println("Такого пункта в меню нет.");
                        break;
                }
                System.out.println("\n" + str);
            }
        }
        iScanner.close();
    }
}
