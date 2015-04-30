package com.java.lab5;

import java.util.Scanner;

public class Lab4 {

	public static void main(String[] args) {


		int a[] = input(5);
		

		System.out.println("อยู่ตำแหน่งที่ "+search(a, 6));

		System.out.println("ค่าเฉลีย  " + mean(a));

	}

	

	public static float mean(int a[]) {
		// TODO Auto-generated method stub
		int num=0;
		for (int i = 0; i < a.length; i++) {
			num+=a[i];
	
		}
		num/=a.length;
		return num;
	}



	public static int search(int[] a, int i) {
		// TODO Auto-generated method stub
		int numReturn = -1;
		for (int j = 0; j < a.length; j++) {
			if(a[j]==i){
				numReturn = j;			
			}			
		}
		return numReturn;
		
		
	}

	public static int[] input(int b) {
		// TODO Auto-generated method stub
		Scanner Sc = new Scanner(System.in);
		int num[] = new int[b];
		for (int i = 0; i < num.length; i++) {
			System.out.print("Input Number " + (i + 1) + ": ");
			num[i] = Sc.nextInt();
		}

		return num;
	}

}
