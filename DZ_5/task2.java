package DZ_5;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class task2 {

    public static void main(String[] args) throws IOException {
        String[] people = new String[] { "Иван Иванов", "Светлана Петрова", "Кристина Белова", "Анна Мусина",
                "Анна Крутова", "Иван Юрин", "Петр Лыков", "Павел Чернов", "Петр Чернышов", "Мария Федорова",
                "Марина Светлова", "Мария Савина", "Мария Рыкова", "Марина Лугова", "Анна Владимирова", "Иван Мечников",
                "Петр Петин", "Иван Ежов" };
        Map<String, String> listPeople = new TreeMap<>();
        Map<String, Integer> sortNames = new LinkedHashMap<>();
        int count = 0;
        for (int i = 0; i < people.length; i++) {
            String[] name = people[i].split(" ");
            ArrayList<String> names = new ArrayList<>();
            for (int j = 0; j < name.length; j++) {
                names.add(name[j]);
            }
            listPeople.put(names.get(1), names.get(0));
        }

        for (var map : listPeople.entrySet()) {
            for (var item : listPeople.entrySet()) {
                if (map.getValue().equals(item.getValue())) {
                    count++;
                    if (count > 1) {
                        listPeople.remove(item.getValue());
                    }

                    sortNames.put(map.getValue(), count);
                }
            }
            count = 0;
        }

        for (int i = sortNames.size(); i > 0; i--) {
            for (var element : sortNames.entrySet()) {
                if (element.getValue() == i) {
                    System.out.printf("%s: %d\n", element.getKey(), element.getValue());
                }

            }
        }

    }
}
