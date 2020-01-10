package saurav_programs;

import java.util.Scanner;

public class PrimeNumberOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number to check");
		int num = sc.nextInt();
		int rem = 0;

		for (int i = 2; i < num; i++) {
			if (num % i == 0) 
			{
				++rem;
			}
		}
		
		if(rem>=1){
			System.out.println("Not a prime numer");
		}
		else
			System.out.println("Prime number");
	}

}
