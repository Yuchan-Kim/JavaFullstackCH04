package com.javaex.practice;

import java.util.Scanner;

public class Ex7 {

    public static void main(String[] args) {
        int[] wonArray = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1};

        Scanner sc = new Scanner(System.in);
        System.out.print("금액: ");
        int amount = sc.nextInt();

        int i = 0;
        while (i < wonArray.length) {
            int count = 0;
            while (amount >= wonArray[i]) {
                amount -= wonArray[i];
                count++;
            }
            System.out.println(wonArray[i] + "원: " + count + "개");
            i++;
        }
        
        sc.close();
    }
}
