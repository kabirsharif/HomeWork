package GitHub5;

public class Class2 {

	public static void main(String[] args) {
		
		int students = 40, rooms = 2;
		if(rooms>0 && students/rooms>30) {
			System.out.print("Rooms are overcrowded because there are ");
			System.out.print(students/rooms);
			System.out.println(" students per classroom.");
		}	
		else {
			if(rooms>0 && students/rooms<=30) {
				System.out.print("There are ");
				System.out.print(students/rooms);
				System.out.println(" students per classroom.");
			}	
		}	
	}

}
