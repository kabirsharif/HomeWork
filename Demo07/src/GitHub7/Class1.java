package GitHub7;

public class Class1 {

	public static void main(String[] args) {
		
		int num1 = 4, num2 = 2, result;
		char opCode = 's';
		
		if(opCode == 'a') {
			System.out.print(num1);
			System.out.print(" + ");
			System.out.print(num2);
			System.out.print(" = ");
			result = num1+num2;
			System.out.println(result);
		}
		else if (opCode == 's') {
			System.out.print(num1);
			System.out.print(" - ");
			System.out.print(num2);
			System.out.print(" = ");
			result = num1-num2;
			System.out.println(result);
		}
	}

}
