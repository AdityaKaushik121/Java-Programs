package StarPattern;

/*
       *
      **
     ***
    ****
   *****
  ******
 *******
********
 *******
  ******
   *****
    ****
     ***
      **
       *
         
 */
import java.util.Scanner;

public class Pattern6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i,j,k;

Scanner sc=new Scanner(System.in);
System.out.println("Enter the number till you want to print the star");
int num=sc.nextInt();

//Upper Triangle:
for(i=0;i<num; i++){
	for(j=num; j>i; j--){
		System.out.print(" ");
	}
	for(k=0; k<=i; k++){
		System.out.print("*");
	}
	System.out.println();
}

//Lower triangle:

for(i=0;i<num+1; i++){
	for(j=num; j>=i; j--){
		System.out.print("*");
	}
	
	System.out.println();
	for(k=0; k<=i; k++){
		System.out.print(" ");
	}
}


	}

}
