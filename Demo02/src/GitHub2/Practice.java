package GitHub2;

import java.util.ArrayList;

public class Practice {

	public static void main(String[] args) {
		
		ArrayList<Integer> intArray = new ArrayList<>();
		intArray.add(1);
		intArray.add(2);
		intArray.add(3);
		intArray.add(4);
		intArray.add(5);
		intArray.add(6);
		intArray.add(7);
		intArray.add(8);
		intArray.add(9);
		intArray.add(10);
		
		for (int i = 4; i<8; i+=2)
		System.out.println(intArray.get(i));
		
		

	}

}
