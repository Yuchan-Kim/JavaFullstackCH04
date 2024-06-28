package com.javaex.practice;

public class Ex8 {

    public static void main(String[] args) {
        int[] lottery = new int[6];

        for (int i = 0; i < lottery.length; i++) {
            boolean unique;
            int number;
            do {
                unique = true;
                number = (int) (Math.random() * 45) + 1;
                for (int j = 0; j < i; j++) {
                    if (lottery[j] == number) {
                        unique = false;
                        break;
                    }
                }
            } while (!unique);
            lottery[i] = number;
        }

        for (int num : lottery) {
            System.out.print(num + "\t");
        }
    }
}
