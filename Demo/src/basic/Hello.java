package basic;

import java.util.Scanner;

public class Hello { 
//class start point
//class level code
	
	public static int age = 25;
	
//main method needs to be here
	public static void main(String args[]) { 
		// syntax to create a java class : AccessModifier & class & class name {}
		// main method start point
		// main level code String is data type & Args is argument
		// main is a method name and is called the heart of a class
		// main method is called driver/executable method
		// public is a access modifier
		// static is a keyword used for static types of content
		// void is a return type which wont return anything.
		// class is a keyword and its used to create a Java class.
		
		try (//we need to pass argument inside the Scanner parenthesis. (System.in)
		Scanner inPut = new Scanner(System.in)) {
			String name=inPut.nextLine();
			System.out.println(name);
		}
		
		// semicolon ";" is used to end a statement or a line
		// System is a Class from JDK
		// out command is used to Output info
		// print()/println() is a Method
		// to print anything, we need to type:
		System.out.print("First Name :    ");
		System.out.println(" Sharif ");
		System.out.print("Middle Initial : ");
		System.out.println("U");
		System.out.print("Last Name :      ");
		System.out.println("Kabir");
		System.out.print("Phone Number :   ");
		System.out.println("929-365-8574");
		System.out.print("Address : ");
		
		System.out.print(Hello.age);
		// double quote converts anything in between to String
		// anything we write inside parenthesis is called declare argument ()
		// [] this is called array 
	} 	// main method end point
	
//java compiler will compile the source code
//jvm will execute the class file

}  
//class end point



//System.out.println(var1 + var2 + var3);
//ctrl+/ Multi line commenting
// Document commenting /** then hit enter button
/** 
 * this is a comment
 * this is handy to explain the type and use case for method
 * what is concatenation : combine a variable with a String
 * calling a variable
 * and variable created inside class and yet outside of a method is called class level variable or global variable or global scope.
 * and variable created inside on a method is called local variable.
 */

//AccessModifier Public, Private, Protected, Default
//Casting (int)
// escape sequence ("\"Hello\""); ("\" " + varName + " \""); \t = tab, \n = new line, \b = backspace, \r = Enter/Return, "\\" this will print only one backslash.
// Static is a keyword, if we use Static keyword, then we can call variable and method by ClassName.
// scanner taking input from user and return in output in console.
// scanner in Java is a class.

//package name : com.amazon.basic, always lower case.
//method Name: starts with Verb + Noun or adjective. follows camelCase. 
// to create main method type main and ctrl + space.
//NestedClass.
//Object is an instance of a class and it will help us call the states, variables , and or methods behaviors. ConstructorOfAClass.

