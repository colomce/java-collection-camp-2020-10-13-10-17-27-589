package com.thoughtworks.collection;

import java.util.List;

import static java.util.stream.Collectors.toList;

public class Filter {

    private List<Integer> array;

    public Filter(List<Integer> array) {
        this.array = array;
    }

    public List<Integer> filterEven() {
        return array.stream().filter(integer -> integer % 2 == 0).collect(toList());
    }

    public List<Integer> filterMultipleOfThree() {
        return array.stream().filter(integer -> integer % 3 == 0).collect(toList());
    }

    public List<Integer> getCommonElements(List<Integer> firstList, List<Integer> secondList) {
        return firstList.stream().filter(secondList::contains).collect(toList());
    }
}
