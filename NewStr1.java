package logicalProgram;

/*
**********
 *********
  ********
   *******
    ******
     *****
      ****
       ***
        **
         *
 */

public class NewStr1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num=10;
for(int i=0;i<num; i++){
	for(int j=0;j<i;j++){
		System.out.print(" ");
	}
	for(int k=num; k>i;k--){
		System.out.print("*");
	}
	System.out.println();
}
	}

}
