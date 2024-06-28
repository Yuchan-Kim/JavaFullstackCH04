package com.javaex.practice;

public class Ex8 {

	public static void main(String[] args) {
		int[] lottary = new int[6];
		lottary[0] = (int)(Math.random()*46)+1;
		lottary[1] = (int)(Math.random()*46)+1;
		lottary[2] = (int)(Math.random()*46)+1;
		lottary[3] = (int)(Math.random()*46)+1;
		lottary[4] = (int)(Math.random()*46)+1;
		lottary[5] = (int)(Math.random()*46)+1;
		
		int index = 0;
		while (index < 6) {
			int count = 0;
			for (int i =0; i < lottary.length; i++) {
				if(lottary[count] == lottary[i]) {
					lottary[i] =(int)(Math.random()*46)+1;
				}
				count += 1;
			}
			index++;
		}
		
		for(int j = 0; j < lottary.length; j++) {
			System.out.print(lottary[j] + "\t");
		}


	}

}
