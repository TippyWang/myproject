package com.tippy.student;

import java.util.Scanner;

public class StudentRunner {
    public static void main(String[] args) {
//        userInput();
//        一個類別 可建立多個物件
//      直接改類別層級 ( static ) 的pass , static 一開始就先存活(?) student.pass 會以最後的 30 作為標準
        Student.pass = 70;
        Student student = new Student( "Tome", 70 ,20);
        Student student2 = new Student( "Kana", 90 ,70);
        Student student3 = new Student( "Inui", 70 ,60);
        Student.pass = 30;
//        GraduateStudent print 被覆寫所以評斷分數為GraduateStudent類別中的pass
        GraduateStudent graduateStudent = new GraduateStudent( "Ange", 70 ,60 ,50);
        student.print();
        student2.print();
        student3.print();
        graduateStudent.print();
        System.out.println("Highest subject : " + student.highest());
    }

    private static void userInput() {
        //        ctrl + p -> 顯示參數
        Scanner scanner = new Scanner(System.in);
        System.out.println("請輸入姓名 : ");
        String name = scanner.next();
        System.out.println("請輸入英文成績 : ");
        int english = scanner.nextInt();
        System.out.println("請輸入數學成績 : ");
        int math = scanner.nextInt();
    }
}
