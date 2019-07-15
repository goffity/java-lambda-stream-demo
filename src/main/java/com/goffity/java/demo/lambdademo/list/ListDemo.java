package com.goffity.java.demo.lambdademo.list;

import java.util.List;
import java.util.stream.Collectors;

public class ListDemo {

    public void printMemberOfList(List<Integer> integerList) {
        integerList.forEach(System.out::println);
    }

    public void showEven(List<Integer> integerList) {
        integerList.stream().filter(n -> n % 2 == 0).forEach(System.out::println);
    }

    public void showOdd(List<Integer> integerList) {
        integerList.stream().filter(n -> n % 2 != 0).forEach(System.out::println);
    }

    public List<Integer> filterEvenNumber(List<Integer> integerList) {
        return integerList.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
    }

    public List<Integer> filterOddNumber(List<Integer> integerList) {
        return integerList.stream().filter(n -> n % 2 != 0).collect(Collectors.toList());
    }

}
