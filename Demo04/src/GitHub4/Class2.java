package GitHub4;

public class Class2 {

	public static void main(String[] args) {
	
		numberWars(2, 3, 4, 5, 6);
	}
	public static int numberWars(int a, int b, int c, int d, int e) {
		int result;
		if((a+b+c)<(d+e)) {
			result=a+b+c;
			System.out.println(a+" + "+b+" + "+c+" is = "+result+" which is larger then "+d+" + "+e+" = "+(d+e));
			return result;
		}
		else {
			result=d+e;
			System.out.println(d+" + "+e+" is = "+result+" which is larger than "+a+" + "+b+" + "+c+" = "+(a+b+c));
			return result;
		}
			
			
	
}
}
