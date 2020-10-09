package com.vannsha.sort;

import java.util.List;

public class InsertionSort implements Sort {

    @Override
    public <T extends Number> List<T> sort(List<T> list) {
        int listSize = list.size();
        for (int i = 0; i < listSize; i++) {
            int j = i;
            while (j > 0 && list.get(j).longValue() < list.get(j - 1).longValue()) {
                swap(list, j - 1, j);
                j--;
            }
        }
        return list;
    }

    private <T> List<T> swap(List<T> list, int oneIndex, int otherIndex) {

        T tempElement = list.get(oneIndex);
        list.set(oneIndex, list.get(otherIndex));
        list.set(otherIndex, tempElement);

        return list;
    }
}
