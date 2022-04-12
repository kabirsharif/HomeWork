package package4;

public class Class1 {

	public static void main(String[] args) {
		
		int i = 1;
		do {
			System.out.print("This is the running of this while loop's ");
			System.out.print(i);
			i++;
			if (i == 1)
				System.out.println("st time.");
			else if (i== 2)
				System.out.println("nd time.");
			else if (i == 3)
				System.out.println("rd time.");
			else
				System.out.println("th time.");
		}
		while (i <=10);
	}

}
