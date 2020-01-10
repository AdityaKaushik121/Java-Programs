package logicalProgram;

import java.util.Scanner;

public class Starpattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		for (int i = 0; i < n; i = i + 1) {

			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
	}

}
