package com.epam.mjc.collections.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListCreator {
    public ArrayList<String> createArrayList(List<String> sourceList) {
        ArrayList<String> eachThirdWordTwice = new ArrayList<>();
        for (int i = 2, l = sourceList.size(); i < l; i += 3) {
            eachThirdWordTwice.add(sourceList.get(i));
            eachThirdWordTwice.add(sourceList.get(i));
        }
        return eachThirdWordTwice;
    }
}
