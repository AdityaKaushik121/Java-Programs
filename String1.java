package logicalProgram;

public class String1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Object ab=new Object();

		String str1="My name is Bond";
		String str2="Hey"+str1;
		String str3="HeyMy name is Bond";
		
		System.out.println("STring 1 is "+str1);
		System.out.println("String 2 is "+str2);
		
		if (str2.equals(str3)){
			System.out.println("Matched String");
		}
		else 
			System.out.println("Not Matched String");
		
	}

}
