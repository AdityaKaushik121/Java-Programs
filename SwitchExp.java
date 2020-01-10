package logicalProgram;

public class SwitchExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num=5;

switch(num){
case 1:
	System.out.println("Hello World");
case 5:
	System.out.println("Value is 5");
case 10:
	System.out.println("Valueis 10");
	break;
	//continue;	//continue cannot be used outside of a loop
case 20:
	System.out.println("Value is 20");
	default:
		System.out.println("No match!!");
}
	}

}
