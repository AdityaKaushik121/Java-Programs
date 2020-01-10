package logicalProgram;

public class Str3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i,j,k, num=10;
for(i=0;i<num;i++){
	for (j=num; j>i; j--){
		System.out.print(" ");
	}
	for(k=0; k<2*i-1; k++){
		System.out.print("*");
	}
	System.out.println();
}
	}

}
