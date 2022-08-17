package com.kiran;

import java.util.Scanner;

class Adding {
		public static void main(String[] args) {
		
			
			
			try(Scanner sc = new Scanner(System.in)) {
				int n=0;
			do {	
			    System.out.println("Enter the number for to odd or even number");
			    n=sc.nextInt();
			
				if(n%2==0) {
			System.out.println("Even number");	}
			
			else if(n%2==-1) { 
				System.out.println("you rock");}
			else {
				System.out.println("odd number");
			}
			}while(n>0);
//}catch(Exception e) {}
			}
			 
			//ternory operator
			//condition?exp:exp
			
			int j=3;
			
			j =4>3?1:3;
			
			System.out.println(j);
}}