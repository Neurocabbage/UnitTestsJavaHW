package seminars.sixth;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class NumberListComparatorTest {

    @Test
    void testCompareLists_FirstListHasGreaterAverage() {
        List<Integer> list1 = Arrays.asList(1, 2, 3);
        List<Integer> list2 = Arrays.asList(1, 2);
        NumberListComparator comparator = new NumberListComparator();

        String result = comparator.compareLists(list1, list2);

        Assertions.assertEquals("Первый список имеет большее среднее значение", result);
    }

    @Test
    void testCompareLists_SecondListHasGreaterAverage() {
        List<Integer> list1 = Arrays.asList(1, 2);
        List<Integer> list2 = Arrays.asList(1, 2, 3);
        NumberListComparator comparator = new NumberListComparator();

        String result = comparator.compareLists(list1, list2);

        Assertions.assertEquals("Второй список имеет большее среднее значение", result);
    }

    @Test
    void testCompareLists_AveragesAreEqual() {
        List<Integer> list1 = Arrays.asList(1, 2);
        List<Integer> list2 = Arrays.asList(2, 1);
        NumberListComparator comparator = new NumberListComparator();

        String result = comparator.compareLists(list1, list2);

        Assertions.assertEquals("Средние значения равны", result);
    }
}
