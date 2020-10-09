package com.vannsha.sort;

import java.util.ArrayList;
import java.util.List;

public class MergeSort implements Sort{

    @Override
    public <T extends Number> List<T> sort(List<T> list) {
        if (list.size() <= 1) {
            return list;
        }
        List<T> listLeft = list.subList(0, list.size()/2);
        List<T> listRight = list.subList(list.size()/2, list.size());

        listLeft = sort(listLeft);
        listRight = sort(listRight);
        return merge(listLeft, listRight);
    }

    private <T extends Number> List<T> merge(List<T> oneList, List<T> twoList) {
        int lengthOneList = oneList.size();
        int lengthTwoList = twoList.size();
        int i = 0;
        int j = 0;
        int count = 0;
        List<T> combinedList = new ArrayList<>();
        while (i < lengthOneList || j < lengthTwoList) {
            if(j == lengthTwoList || (i < lengthOneList && oneList.get(i).longValue() < twoList.get(j).longValue())) {
                combinedList.add(count++, oneList.get(i++));
            } else {
                combinedList.add(count++, twoList.get(j++));
            }
        }
        return combinedList;
    }
}
