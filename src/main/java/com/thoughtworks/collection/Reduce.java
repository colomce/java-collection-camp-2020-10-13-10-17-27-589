package com.thoughtworks.collection;

import org.apache.commons.lang3.NotImplementedException;

import java.util.List;
import java.util.stream.Collectors;

public class Reduce {

    List<Integer> arrayList;

    public Reduce(List<Integer> arrayList) {
        this.arrayList = arrayList;
    }

    public double getAverage() {
        int numberOfElements = arrayList.size();
        List<Double> numbers = arrayList.stream().map(Double::valueOf).collect(Collectors.toList());
        return numbers.stream().reduce((number1, number2) -> number1 + number2).map(total -> total / numberOfElements).get();
    }

    public int getMaxValue() {
        return arrayList.stream().reduce(0, (num1, num2) -> Integer.max(num1, num2));
    }

    public int getLastOdd() {
        return arrayList.stream().filter(integer -> integer % 2 == 1).reduce((firstInteger, secondInteger) -> secondInteger).get();
    }
}
