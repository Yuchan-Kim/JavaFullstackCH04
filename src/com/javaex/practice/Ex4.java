package com.javaex.practice;

public class Ex4 {

	public static void main(String[] args) {
		int[] data = {1,3,4,8,9,11,15,19,18,20,30,33,31};
		int count = 0;
		int sum = 0;
		for(int i = 0; i <data.length; i++) {
			if(data[i] % 3 == 0) {
				count = count + 1;
				sum = sum + data[i];
			}
		}
		System.out.println("주어진 배열에서 3의 배수의 개수=>"+count);
		System.out.println("주어진 배열에서 3의 배수의 개수=>"+sum);
	}

}
