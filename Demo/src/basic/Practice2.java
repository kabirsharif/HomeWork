package basic;

public class Practice2 {
	public static void main(String args[]) {
		float studentNumber = 10.0f, classNumber = 2.0f;
		
		if (studentNumber > 0.0f) {
			if (classNumber > 0.0f)
				System.out.print("Average students per class : ");
				System.out.println(studentNumber/classNumber);
			
		}
	    else {
		    System.out.println("no students");
	    }

	}
}

