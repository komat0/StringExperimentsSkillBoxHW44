import java.util.ArrayList;

public class Salary {

    public static void salaryCounter() {

        // Вводные переменные для изменений в одном месте.
        String inputText = "Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей";
        char comma = ',';
        int startIndex = 0;
        int sum = 0;

        // Массив для хранения кусков текста, разделенных запятыми
        ArrayList<String> collectParts = new ArrayList<>();

        // Цикл выявления запятых, вычисления индексов для текста между запятыми, добавление
        // этого текста в массив с удалением пробелов. Для отсечения запятых используется -1 в первом индексе начиная
        // с первой найденной запятой.
        for (int i = 0; i < inputText.length(); i++) {

            // Вычисляю индексы запятых.
            if (inputText.charAt(i) == comma) {
                System.out.println("Индекс запятой: " + i);
                collectParts.add(inputText.substring(startIndex, i).trim());
                startIndex = i + 1;
            }

            // Условие для захвата последнего диапазона от запятой до конца данной строки.
            if (i == inputText.length() - 1) {
                collectParts.add(inputText.substring(startIndex).trim());
            }
        }

        // В цикле для каждой записи в массиве оставляю только значения с цифрами. Если запись не становится
        // пустой, то добавляю ее к переменной sum, которая считает сумму всех зарплат.
        for (String valueToChange : collectParts) {
            valueToChange = valueToChange.replaceAll("[^0-9]+", "");

            if (!valueToChange.isEmpty()) {
                int number = Integer.parseInt(valueToChange);
                sum = sum + number;
            }
        }
        System.out.println(collectParts);
        System.out.println(sum);
    }
}
