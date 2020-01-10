package StarPattern;


/*

*******
 *****
  ***
   *
   
 */
public class Pattern8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i,j,k;
int num=5;
for(i=0;i<num;i++){
	for(j=0;j<i;j++){
		System.out.print(" ");
	}
	for(k=num; k>=2*i-1; k--){
		System.out.print("*");
	}
	
	System.out.println();
}
	}

}
