package GitHub7;

public class Class2 {

	public static void main(String[] args) {
		
		int num1 = 5, num2 = 2, remainder = num1%num2;
		
		switch (remainder) {
			case 0:
				System.out.print(num1);
				System.out.print(" is an even number.");
				break;
			case 1:
				System.out.print(num1);
				System.out.print(" is an odd number.");
				break;
		}
	}

}
