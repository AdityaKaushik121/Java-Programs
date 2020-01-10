package StarPattern;


/**

 *****
  ****
   ***
    **
     *

 */
public class Pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i,j;
int num=5;


for(i=0;i<num; i++){
	for(j=0;j<=i;j++){
		System.out.print(" ");
	}
	for(int k=num; k>i; k--){
		System.out.print("*");
	}
	System.out.println();
}
	}

}
