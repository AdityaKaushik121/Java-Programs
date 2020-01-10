package logicalProgram;

public class ExceptionHandlingExmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try{
			System.out.println(3/0);
			System.out.println("In Try Block");
		}
		catch(ArithmeticException e){
			System.out.println("Exception Encountered:  "+e.getMessage());
		}
		
	}

}
