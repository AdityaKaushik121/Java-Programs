package StarPattern;

public class NumPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=71;
		
		for(int i=65;i<num;i++){
			for(int j=65;j<=i; j++){
			
				System.out.print((char)j);
			}
			System.out.println();
		}
	}

}
