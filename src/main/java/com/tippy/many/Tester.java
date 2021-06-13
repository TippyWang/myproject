package com.tippy.many;

import java.util.*;

public class Tester {
    public static void main(String[] args) {
//        map();
//        set();
//        list();
//        arrayTest();
    }

    private static void map() {
        //  HashMap  key唯一值(重複的話value會被新的value蓋掉) 無序
        HashMap<Integer , String> hashMap = new HashMap<>();
        hashMap.put(0,"i am 0");
        hashMap.put(3,"i am 3");
        hashMap.put(5,"i am 5");
        hashMap.put(0,"i am 0 again");
        System.out.println("map all value : " + hashMap);
        System.out.println("-- map use key  get value --");
        for (int i : hashMap.keySet()){
            System.out.println("key : " +i +" value : " +hashMap.get(i) );
        }
    }

    private static void set() {
        //  HashSet 無序 不重複
        HashSet<Integer> set = new HashSet();
        set.add(1);
        set.add(5);
        set.add(8);
        set.add(1);
        System.out.println("set all value : " + set);
    }

    private static void list() {
        ArrayList arrayListObject = new ArrayList();
        arrayListObject.add(123);
        arrayListObject.add("hello");
        arrayListObject.add('P');
        System.out.println("-- arrayListObject get須轉型 --");
//        arrayListObject 中的值為object 如須使用int 需將obj轉int ！！ 如記錯格式會發生error
        int objectToInt = (int) arrayListObject.get(0);
        System.out.println(objectToInt);
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        integerArrayList.add(1);
        integerArrayList.add(11);
        integerArrayList.add(111);
        System.out.println("-- integerArrayList get不須轉型 --");
        int intArrayValue = integerArrayList.get(0);
        System.out.println(intArrayValue);
//        直接使用 Arrays.asList 建立 List
        List<Integer> integerList = Arrays.asList(11, 54, 38, 1, 87);
        System.out.println("integerList size : " + integerList.size());
    }

    private static void arrayTest() {
        int[] intTest = new int[5];
        intTest[0] = 10;
        intTest[1] = 20;
        intTest[3] = 80;
        for (int num : intTest){
            System.out.println("num : " + num);
        }
        System.out.println(intTest[2]);
    }
}
