package GitHub3;

public class Practice {

	public static void main(String[] Args) {
		Practice objct = new Practice();
		calculate(10, 5);
		
		calculate(20, 5);
		
		sum(2, 4, 6);
		System.out.println(100+sum(2,4,6));
		
		divider(10, 5);
		remainder(7, 3);
		objct.calculate2(20, 5);
		objct.sum2(15, 20, 25);
		objct.divider2(6, 2);
		objct.remainder2(5, 2);
		}
	
	public static int calculate(int a, int b) {
		int result= a+b;
		System.out.println(result);
		return result;
	}
	public static int sum(int a, int b, int c) {
		return a+b+c;
	}
	public static float divider(float a, float b) {
		return a/b;
	}
	public static double remainder(double a, double b) {
		return a%b;
	}
	public int calculate2(int a, int b) {
		int result= a+b;
		System.out.println(result);
		return result;
	}
	public int sum2(int a, int b, int c) {
		return a+b+c;
	}
	public float divider2(float a, float b) {
		return a/b;
	}
	public double remainder2(double a, double b) {
		return a%b;
}
}
