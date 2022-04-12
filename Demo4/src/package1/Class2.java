package package1;

public class Class2 {

	public static void main(String[] args) {
		

		int[] theVal1s = { 2, 3, 4, 5 };
		int[] theVal2s = { 2, 3, 4, 5 };
		char[] opCodes = { 'a', 's', 'd', 'm' };
		
		int sum = 0;
	
		for(int currentVal : theVal1s)
			sum += currentVal;
		
		System.out.println(sum);
	}

}
