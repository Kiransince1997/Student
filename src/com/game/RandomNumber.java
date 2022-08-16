package com.game;


import java.util.*;

public class RandomNumber {
	public static void main(String[] args) {
	
		int randomNumber=(int)(Math.random()*100);
		try (Scanner scan = new Scanner(System.in)) {
			int gusserNumber=0;
			
			
	
			do {
				System.out.print("Enter your number b/w 1-100 :");
				 gusserNumber= scan.nextInt();
				
				if(gusserNumber == randomNumber) {
					System.out.println("Wohoo..! you are Correct");
					break;
				}
				
				else if(gusserNumber < randomNumber) {
					System.out.println("Bhari kammi athale");
					
					
				}
				else {
					System.out.println("Bhari myal hogbitti");
				}
			}while(gusserNumber>=0);
		}
		System.out.println("My number is :"+randomNumber);
	}
}


