package basic;

import java.util.Scanner;

public class DataType {

	public static void main(String args[]) {
		
		String firstName = "Sharif";
		String lastName = "Kabir";
		
		System.out.print(firstName+" ");
		System.out.println(lastName);
		// Lets try to add a line between two lines.
		System.out.println();
		System.out.print("Never hurts to try stuff out ");
		//age is from a different class called Hello.
		System.out.println(Hello.age);
		//non static variable cannot be called with class name.
		//Object is an instance of a class, and a variable from a different class which is not static can be called using the object.
		//Object creating syntax : ClassName objectName = new constructorOfClass()
		
		
			try (Scanner input = new Scanner(System.in)) {
				{
				System.out.println("***** Calculate Salary *****\n");
				
				
				int workingHour=input.nextInt();
				int hourlySalary=input.nextInt();
				int weeklySalary= workingHour*hourlySalary;
				double yearlySalary=weeklySalary*52;
				double taxRate=input.nextDouble();
				double netSalary=yearlySalary-yearlySalary*taxRate;			
				System.out.println("Net Yearly Salary is : " + netSalary);
				}
				
				
//		
//		int var1 = 1, var2 = 5, var3 = 3;
//
//		
//		if (var1 < var2) {
//			if (var2 < var3) {
//				System.out.print("Variable 3 is largest and it is = ");
//				System.out.println(var3);
//			}
//			else {
//				System.out.print("Variable 2 is largest and it is = ");
//				System.out.println(var2);
//			    
//			}
//		}
//		else {
//			System.out.print("Variable 1 is largest and it is = ");
//			System.out.println(var1);
//		}
			}
    }
}
