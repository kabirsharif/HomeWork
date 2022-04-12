package package5;

public class Class1 {

	public static void main(String[] args) {
		
		int num1 = 4, num2 = 0, result;
		char opCode = 'd';
		
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
		else if (opCode == 'd') {
			if (num2 > 0) {
				System.out.print(num1);
				System.out.print(" / ");
				System.out.print(num2);
				System.out.print(" = ");
				result = num1/num2;
				System.out.println(result);
			}
			else
				System.out.println("Error! the second number must be more then Zero!");
		}
			
	}

}
