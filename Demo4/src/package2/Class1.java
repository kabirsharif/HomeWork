package package2;

public class Class1 {

	public static void main(String[] args) {
		


		int[] theVal1s = { 2, 3, 4, 5 };
		int[] theVal2s = { 2, 3, 4, 5 };
		
		
		int sum1 = 0;
		int sum2 = 0;
	
		for(int currentVal : theVal1s)
			sum1 += currentVal;
		for(int currentVal : theVal2s)
			sum2 += currentVal;
		
		for(int i = 0; i < theVal1s.length; i++) {
			System.out.print(theVal1s[i]);
			if (i < 3)
				System.out.print(" + ");
			else
				System.out.print(" = ");
		}	
		
		System.out.println( sum1 );
		
	}

}
