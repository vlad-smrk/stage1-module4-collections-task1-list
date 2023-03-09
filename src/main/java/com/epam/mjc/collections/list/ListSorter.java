package com.epam.mjc.collections.list;

import java.util.Comparator;
import java.util.List;

public class ListSorter {
    public void sort(List<String> sourceList) {
        sourceList.sort(new ListComparator());
    }
}

class ListComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        int first = Integer.parseInt(a);
        int second = Integer.parseInt(b);
        int firstProcessed = 5 * first * first + 3;
        int secondProcessed = 5 * second * second + 3;
        if (firstProcessed == secondProcessed) {
            return first - second;
        } else {
            return firstProcessed - secondProcessed;
        }
    }
}
