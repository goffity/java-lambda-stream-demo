package com.goffity.java.demo.lambdademo.list;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class ListDemoTest {

    private ListDemo listDemo;

    private List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

    @Before
    public void setUp() throws Exception {
        listDemo = new ListDemo();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testPrintMemberOdList() {
        System.out.println("testPrintMemberOdList()");
        listDemo.printMemberOfList(list);
    }

    @Test
    public void testFilterEvenMemberInList() {
        System.out.println("testFilterEvenMemberInList()");
        listDemo.showEven(list);
    }

    @Test
    public void testFilterOddMemberInList() {
        System.out.println("testFilterEvenMemberInList()");
        listDemo.showOdd(list);
    }

    @Test
    public void testFilterEvenNumber() {
        System.out.println("testFilterEvenNumber()");
        List<Integer> actual = listDemo.filterEvenNumber(list);
        actual.forEach(System.out::println);
        Assert.assertEquals(5, actual.size());
    }

    @Test
    public void testFilterOddNumber() {
        System.out.println("testFilterOddNumber()");
        List<Integer> actual = listDemo.filterOddNumber(list);
        actual.forEach(System.out::println);
        Assert.assertEquals(5, actual.size());
    }
}