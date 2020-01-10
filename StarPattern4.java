package logicalProgram;

public class StarPattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 5;
		for (int i = 0; i < 5; i++) {
			for (int j = i; j <= 2 * i; j++) {
				System.out.print(i);

				for (int k = 0; k < j; k++) {
					System.out.print(" ");

				}

			}
			System.out.println(" ");
		}
	}

}
