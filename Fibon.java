package logicalProgram;

public class Fibon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=0, b=1, c=1, sum;
		int num=10;
		System.out.println("Fibonacci series till "+num+" is \n"+a+" \n"+b);
		for(int i=0; i<num-2; i++){
			sum=a+b;
			a=b;
			b=sum;
			System.out.println(sum);
		}
	}

}
