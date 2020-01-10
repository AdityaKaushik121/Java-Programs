/**
 * 
 */
package logicalProgram;

/**
 * @author AdityaKaushik
 *
 */
public class StringMethodExample {

	public static void main(String[] args) {
		String str1=new String ("abcdefg");
		String str2="ZYXWVUTSR";
		
		
		//System.out.println(str1.toUpperCase());
		//System.out.println(str2.toLowerCase());
		
		int i=str2.indexOf('W');
		
		//System.out.println("Index of "+i);
		int x=str2.indexOf('Y', 2);
		System.out.println("Index of y is"+x);
	}

}
