package com.thoughtworks.collection;

import java.util.Arrays;
import java.util.List;

import static java.util.Comparator.reverseOrder;
import static java.util.stream.Collectors.toList;

public class MyMap {

    private List<Integer> array;
    private String[] letters = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l",
            "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
    private List<String> letterList = Arrays.asList(letters);

    public MyMap(List<Integer> array) {
        this.array = array;
    }

    public List<Integer> getTriple() {
        return array.stream().map(integer -> integer * 3).collect(toList());
    }

    public List<String> mapLetter() {
        return array.stream().map(integer -> letters[integer - 1]).collect(toList());
    }

    public List<Integer> sortFromBig() {
        return array.stream().sorted(reverseOrder()).collect(toList());
    }
}
