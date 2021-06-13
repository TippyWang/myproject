package com.tippy.guess;

import java.util.Random;
import java.util.Scanner;

public class GameFor {
    public static void main(String[] args) {
        Random random = new Random();
        int secret = random.nextInt(10) + 1;
        System.out.println("the secret is " + secret);
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i<=5 ; i++){
            System.out.println("guess times ( " + i + " / 5 )");
            System.out.print("input num : ");
            int num = scanner.nextInt();
            if (num > secret){
                System.out.println("Lower");
            }else if (num < secret){
                System.out.println("Higher");
            }else {
                System.out.println("Yes , the num is : " + num);
                break;
            }
        }
        System.out.println("-- end --");
    }
}
