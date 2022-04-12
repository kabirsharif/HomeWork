package package1;

public class Class4 {
	public static void main(String args[]) {
	

		int[] theVal1s = { 2, 3, 4, 5 };
		int[] theVal2s = { 2, 3, 4, 5 };
//		char[] opCodes = { 'a', 's', 'd', 'm' };
		
		int sum1 = 0;
		int sum2 = 0;
	
		for(int currentVal : theVal1s)
			sum1 += currentVal;
		for(int currentVal : theVal2s)
			sum2 += currentVal;
		
		System.out.println(sum1);
	}

}
