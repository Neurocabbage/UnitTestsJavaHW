package seminars.sixth;

import java.util.List;

/**
 * Для сравнения средних значений чисел в списке.
 */
public class NumberListComparator {

    /**
     * Сравнение среднего значения списков чисел.

     * @param list1 Первый список.

     * @param list2 Второй список.
     * @return Возвращается строка с результатом сравнения.
     */
    public String compareLists(List<Integer> list1, List<Integer> list2) {
        double average1 = calculateAverage(list1);
        double average2 = calculateAverage(list2);

        if (average1 > average2) {
            return "Первый список имеет большее среднее значение";
        } else if (average2 > average1) {
            return "Второй список имеет большее среднее значение";
        } else {
            return "Средние значения равны";
        }
    }


    /**
     * вычисление среднего значения в списке.

     * @param list Принимает список.
     * @return Возвращается среднее значение списка.
     */
    private double calculateAverage(List<Integer> list) {
        if (list == null || list.isEmpty()) {
            return 0;
        }

        int sum = 0;
        for (int num : list) {
            sum += num;
        }

        return (double) sum / list.size();
    }
}
