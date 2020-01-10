package logicalProgram;

import java.util.Scanner;

public class StringMethod4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
        
        String s1;
        Scanner scan = new Scanner(System.in);
        
		
       
        int i1=scan.nextInt();
        double d1=scan.nextDouble();
        //Scanner sc=new Scanner(System.in);
        s1=scan.nextLine();
        s1=scan.nextLine();
        
        System.out.println(i+i1);
        System.out.println(d+d1);
        System.out.println(s.concat(s1));
//s1 = scan.next() + scan.nextLine();
	}

}
