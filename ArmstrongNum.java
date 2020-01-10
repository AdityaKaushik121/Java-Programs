package logicalProgram;

public class ArmstrongNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num=407;

int a,b,c,d;

a=num%10;
b=(int)(num%100)/10;
c= (int)num/100;

int calcNum=(a*a*a)+(c*c*c)+(b*b*b);
System.out.println(calcNum);
	if(num==calcNum){
	System.out.println("Armstrong number");	
	}
	else
		System.out.println("Not a Armstrong Number");
	}
}
