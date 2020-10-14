package com.thoughtworks.collection;

import java.util.List;

import static java.util.stream.Collectors.toList;

public class Reduce {

    private List<Integer> arrayList;

    public Reduce(List<Integer> arrayList) {
        this.arrayList = arrayList;
    }

    public double getAverage() {
        int numberOfElements = arrayList.size();
        List<Double> numbers = arrayList.stream().map(Double::valueOf).collect(toList());
        return numbers.stream().reduce(Double::sum).map(total -> total / numberOfElements).get();
    }

    public int getMaxValue() {
        return arrayList.stream().reduce(Integer.MIN_VALUE, Integer::max);
    }

    public int getLastOdd() {
        return arrayList.stream().filter(integer -> integer % 2 == 1).reduce((firstInteger, secondInteger) -> secondInteger).get();
    }
}
