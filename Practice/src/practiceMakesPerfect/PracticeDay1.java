package practiceMakesPerfect;

import java.util.Scanner;

public class PracticeDay1 {
	
	public static void main(String Args[]) {
		
		Scanner input=new Scanner(System.in);
		Execution solve=new Execution();
		
		System.out.println("Enter the first value : ");
		solve.val1 = input.nextDouble();
		System.out.println("Enter operation type : ");
		solve.opCode = (char) input.next().charAt(0);
		System.out.println("Enter the second value : ");
		solve.val2 = input.nextDouble();
		
		solve.execute();
		
		
		
		
		
	}
	
	
}