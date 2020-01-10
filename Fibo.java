package logicalProgram;

import java.util.Scanner;

public class Fibo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value till you want to print the fibonacci series: ");
		int n=sc.nextInt();
		
		
int a=0, b=1, sum;

int i=1;
System.out.println(a+"\n"+b);

while(i<=n-2){
	sum=a+b;
	a=b;
	b=sum;
	i++;
	System.out.println(sum);
}
	}

}
