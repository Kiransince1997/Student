package com.kiran;

import java.util.Scanner;

public class WhileLoop {
	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Enter the size of the Border");
			int n=scan.nextInt();
			
			for(int i=0; i<=n; i++) {
				for(int j=0; j<=n; j++) {
					if(i==0||j==0||i==n||j==n) {
						System.out.print(" $ ");
					}else {
						System.out.print("   ");
					}
				}System.out.println();
			}
		}
	}
}

