package com.tippy;

public class Hello {
    public static void main(String[] args) {
        Person person = new Person("Andy" , 150f , 90f);
        person.hello();
        person.detail();
        Person a = new Person();
//      基本資料型態
        int num = 10 ;
        char charTest = 'A';
        boolean isTrue = true ;
/*
*       參照資料型態 ( Reference Data Type ) 具有 method、function 可使用
*       為了基本資料所設計之類別 ＝> 包裝類別 ( Wrapper Class )
* */
        Integer rfNum = 100;
        Character reChar = 'B';
        Boolean rfIsTrue = false;
    }
}
