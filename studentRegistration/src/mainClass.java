
import java.util.Scanner;

public class mainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//initialize a course object
		Instructor instructor = new Instructor("Dr. Yan", "1234");
		Course c= new Course("Data Structure", "3200", instructor, 5, 3);
		//Student s1=new Student();
		
		Scanner input = new Scanner(System.in);
		String more;
		int Choice =-1;
		do {
			menu();
			System.out.println("Type Your choice:");
			Choice = input.nextInt();
			
			switch(Choice) {
			case 1: //call the method and perform the corresponding function
			{
				System.out.println("Type the student name:");
				String sname = input.nextLine();
				System.out.println("Type the sudent ID:");
				String sid = input.nextLine();
				Student newStudent = new Student(sname, sid);
				c.addStudent(newStudent);
				
			}
				break;
			case 2: //call the method and perform the corresponding function
			{
				System.out.println("Type the student name:");
				String sname = input.nextLine();
				System.out.println("Type the sudent ID:");
				String sid = input.nextLine();
				Student target = new Student(sname, sid);
				c.searchStudentList(target);
			}
				break;
			case 3: //call the method and perform the corresponding function
			{
				System.out.println("Type the student ID:");
				String sid = input.nextLine();
				Student student = new Student("", sid);
				c.removeStudent(student);
			}
				break;
			case 4: //call the method and perform the corresponding function 
			{
				c.printStudentList();
			}
				break;
			case 5: //call the method and perform the corresponding function 
			{
				c.printWaitList();
			}
				break;	
			}
			System.out.println("Type \'Y\' for continue.");
			more=input.nextLine();
		}while(more.compareToIgnoreCase("Y")==0);
	}

	public static void menu() {//modify the method for your application
		System.out.println("1: Add student to course");
		System.out.println("2: Check to see if student is registered in course");
		System.out.println("3: Remove student from course");
		System.out.println("4: Display course's student list");
		System.out.println("5: Display course's wait list");
		}
}
