package basic;

public class Practice {

	public static void main(String args[]) {
		int val1 = 1, val2 = 5, diff;
				if (val1 > val2) {
					System.out.print("val1 is greater");
					diff = val1 - val2;
					System.out.print("val1 is ");
					System.out.print(diff);
					System.out.println(" more then val2.");
					
				}
				else if (val1 < val2) {
					System.out.println("val2 is greater");
					diff = val2 - val1;
					System.out.print("val2 is ");
					System.out.print(diff);
					System.out.println(" more then val1.");
					
				}
				else
					System.out.println("val1 and val2 are equal");
	}
}
