package package5;

public class Class2 {

	public static void main(String[] args) {
		
		int num1 = 4, num2 = 5, result;
		char opCode = 'm';
		
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
		else if (opCode == 'm') {
			System.out.print(num1);
			System.out.print(" x ");
			System.out.print(num2);
			System.out.print(" = ");
			result = num1*num2;
			System.out.println(result);
		}
			
	}

}
