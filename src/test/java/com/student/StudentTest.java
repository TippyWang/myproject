package com.student;

import com.tippy.student.Student;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StudentTest {

    @Test
    void highestTest(){
        int english = 90;
        int math = 80;
        Student student = new Student("Tippy" , english ,math);
//        通常字尾帶s可直接使用不須new物件，參數 1 -> 應回傳的值 2 -> 測試的function
        Assertions.assertEquals( (english > math )? english : math , student.highest() );
    }

    @Test
    void averageTest(){
        int english = 90;
        int math = 80;
        Student student = new Student("Tippy", english, math);
        Assertions.assertEquals((english + math)/2, student.getAverage());
    }

}
