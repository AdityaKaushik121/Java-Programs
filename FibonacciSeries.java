package interviewQuestions;
import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number till you want to print Fibonacci series");
		int num=sc.nextInt();
		int a=0, b=1;
		int sum;
		
		if(num>=0){
		System.out.println(a);
		System.out.println(b);
		for (int i=1;i<num-1;i++){
			sum =a+b;
			
			a=b;
			b=sum;
			System.out.println(sum);
		}}
		else 
			System.out.println("Can't print ");
		

	}

}
