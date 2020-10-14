package com.thoughtworks.collection;

import java.util.List;

public class Reduce {

    private List<Integer> arrayList;

    public Reduce(List<Integer> arrayList) {
        this.arrayList = arrayList;
    }

    public double getAverage() {
        int numberOfElements = arrayList.size();
        return arrayList.stream().reduce(Integer::sum).map(total -> (double)total / numberOfElements).get();
    }

    public int getMaxValue() {
        return arrayList.stream().reduce(Integer.MIN_VALUE, Integer::max);
    }

    public int getLastOdd() {
        return arrayList.stream().filter(integer -> integer % 2 == 1).reduce((firstInteger, secondInteger) -> secondInteger).get();
    }
}
