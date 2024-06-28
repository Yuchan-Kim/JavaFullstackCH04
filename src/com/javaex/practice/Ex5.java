package com.javaex.practice;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double inputs = 0;
		double[] arr = new double[5];
		for(int i = 0; i < arr.length; i++) {
			int num = sc.nextInt();
			arr[i] = num;
		}
		for(int j = 0; j < arr.length; j++) {
			inputs = inputs + arr[j];
		}
		
		System.out.println("평균은 " + (inputs/5) + " 입니다.");
		sc.close();
	}

}
