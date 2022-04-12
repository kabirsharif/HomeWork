package practiceMakesPerfect;

public class Execution {
	
	public double val1 = 0.0;
	public double val2 = 0.0;
	public char opCode;
	public double result = 0.0;
	
	
	
	public void execute() {
		
		switch(opCode) {
			case 'a':
				result = val1 + val2;
				break;
			case 's':
				result = val1 - val2;
				break;
			case 'm':
				result = val1 * val2;
				break;
			case 'd':
				result = val2 != 0? val1/val2 : 0.0d;
				break;
			case 'r':
				result = val1 % val2;
				break;
			default:
				System.out.println("Invalid input, the Calculator will now terminate.");
				result = 0.0d;
				break;
		}
		
		
		
	}

	public static void main(String[] args) {
		

	}

}
