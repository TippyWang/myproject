package com.tippy.guess;

import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Random random = new Random();
        int secret = random.nextInt(10) + 1;
        System.out.println("the secret num is " + secret);
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        while (number != secret){
            System.out.print("Input num : ");
            number = scanner.nextInt();
            if (number > secret){
                System.out.println("Lower");
            }else if (number < secret){
                System.out.println("Higher");
            }else {
                System.out.println("Yes , the num is : " + number);
            }
        }
/*      do while 先執行一次 再去判斷 while 是否在重複執行
        boolean doWhile = false;
        int doWhileNum = 0;
        do {
            if (doWhileNum == 3){
                doWhile = true;
            }
            System.out.println(doWhileNum);
            doWhileNum++;
        }while (!doWhile);*/
    }
}
