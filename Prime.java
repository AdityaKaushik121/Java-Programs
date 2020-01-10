package interviewQuestions;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//System.out.println("Hello");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numer");
		
		
		int num=sc.nextInt();		
		int count=0;
		
		for(int i=3; i<num; i++){
			
			if(num%i==0){
				++count;
			}
			}
		if(count>=1){
			System.out.println("Not Prime");
		}
		else System.out.println("Prime");
	}

}
