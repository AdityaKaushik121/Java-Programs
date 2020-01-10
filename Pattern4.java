package StarPattern;
/*

       *
      **
     ***
    ****
   *****
  ******
 *******
 */



import java.util.Scanner;

public class Pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i,j;

Scanner sc = new Scanner(System.in);
System.out.println("Enter the number till where you want to print the pattern");
int num =sc.nextInt();

for(i=0;i<num;i++){
	for(j=i;j<num; j++){
		System.out.print(" ");
	}
	for (int k=0; k<=i;k++){
		System.out.print("*");
	}
	System.out.println();
}
	}

}
