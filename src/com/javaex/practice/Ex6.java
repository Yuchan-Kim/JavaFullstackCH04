package com.javaex.practice;

public class Ex6 {

	public static void main(String[] args) {
		char c[] = {'T','h','i','s',' ','i','s',' ','a',' ','p','e','n','c','i','l'};
		for(int i = 0; i < c.length; i++) {
			System.out.print(c[i]);
		}
		
		System.out.println();
		
		for(int j = 0; j < c.length; j++) {
			if(c[j] == ' ') {
				System.out.print(",");
			}else {
				System.out.print(c[j]);
			}
		}
	}

}
