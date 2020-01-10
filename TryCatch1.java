package logicalProgram;

public class TryCatch1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i=19,j=0;
		int c;
		//c=i/j;
		try{
			c=i/j;
		}
		catch(ArithmeticException e){
			System.out.println("Exception encountered : "+e);
			
		}
	}

}
