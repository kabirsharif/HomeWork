package package1;

public class Class3 {

	public static void main(String[] args) {
		
		int students = 68, rooms = 2;
		if(rooms>0 && students/rooms>30)
			System.out.print("Rooms are overcrowded because there are ");
			System.out.print(students/rooms);
			System.out.println(" students per room.");
	}

}
