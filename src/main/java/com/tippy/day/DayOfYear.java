package com.tippy.day;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;
import java.util.Scanner;

public class DayOfYear {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int year = scanner.nextInt();
        BufferedReader bufferedReader = new BufferedReader( new InputStreamReader(System.in));
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH) + 1;
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        try {
            System.out.print("input year : ( "+ year + " ) ");
            String yearLine = bufferedReader.readLine();
            year = ( yearLine.length() > 0 ) ? Integer.parseInt(yearLine) : year;
//            if (yearLine.length() > 0){
//                year = Integer.parseInt(yearLine);
//            }
            System.out.println(year);
            System.out.print("input year : ( "+ month + " ) ");
            String monthLine = bufferedReader.readLine();
            month = ( monthLine.length() > 0 ) ? Integer.parseInt(monthLine) : month;
//            if (monthLine.length() > 0){
//                month = Integer.parseInt(monthLine);
//            }
            System.out.println(month);
            System.out.print("input year : ( "+ day + " ) ");
            String dayLine = bufferedReader.readLine();
            day = ( dayLine.length() > 0 ) ? Integer.parseInt(dayLine) : day;
//            if (dayLine.length() > 0){
//                day = Integer.parseInt(dayLine);
//            }
            System.out.println(day);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
