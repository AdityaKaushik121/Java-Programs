package interviewQuestions;
import java.util.Scanner;

public class Swapping {

	public static void main(String[] args) {
	
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of A");
		
		int a=sc.nextInt();
		System.out.println("Enter the value of B");
		int b=sc.nextInt();
		
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("Value of A after Swap is :"+a);
		System.out.println("Value of B After swap is :"+b);

	}

}
