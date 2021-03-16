
public class Course {
	//data field here
	//Name of the course
	String courseName;
	//Course registration code
	String regCode;
	//Instructor
	Instructor instructor;
	//Maximum number of students
	int maxStudent;
	//Number of enrolled students
	int enrolledStudent;
	
	//Array stores students registered in the course (use a regular array instead of ArrayList)
	Student[] students;
	//Maximum size of waitlist
	int maxWaitlist;
	//Number of wait student added (optional)
	int waitStudent;
	//Array stores students in the waitList (use a regular array instead of ArrayList)
	Student[] waitlist;

	//constructor method here
	 public Course(String courseName, String regCode, Instructor instructor, int maxStudent, int maxWaitlist) {
		 super();
		 this.courseName = courseName;
		 this.regCode = regCode;
		 this.instructor = instructor;
		 this.maxStudent = maxStudent;
		 this.maxWaitlist = maxWaitlist;
		 students = new Student[this.maxStudent];
		 waitlist = new Student[maxWaitlist];
	   }
	
	//Methods to set and retrieve the instructor (get and set method)
	 public Instructor getInstructor() {
	       return instructor;
	   }
	 
	 public void setInstructor(Instructor instructor) {
	       this.instructor = instructor;
	   }
	
	//A method to search for a student in the course
	 public int searchStudentList(Student target) {
		 	//for each element on StudentList , numStud
		 for (int i = 0; i < enrolledStudent; i++) {
			 Student student = students[i];
			  //if element equals target, return the index
			 if (student.getid() == target.getid()) {
				 return i;
			 }
			//return -1; indicate cannot find student
			 return -1;
		 }
	 }
	 
	 public int searchWaitList(Student target) {
			//for each element on WaitList , numWait
		 for (int i = 0; i < waitStudent; i++) {
			 Student student = waitlist[i];
			  //if element equals target, return the index
			 if (student.getid() == target.getid()) {
				 return i;
			 }
			//return -1; indicate cannot find student
			 return -1;
		}
	 }
	
	//A method to add a student to the course
	 public void addStudent(Student newStudent) {
		//if studentList is not full
		 if (enrolledStudent < maxStudent) {
			 //if newStudent is not there
			 if (newStudent != searchStudentList(Student.getid())) {
		 		//add new Student to studentList
				//--insert newStudent to spot numStud
				//--increase numStud
				//--success add to student list
				 students[enrolledStudent] = newStudent;
				 enrolledStudent++;
			 } else if (waitStudent < maxWaitlist) {
				//else if waitList is not full
				//if newStudent is not there
				 if (newStudent != searchStudentList(Student.getid())) {
					 waitlist[waitStudent] = newStudent;
					 waitStudent++;
				 } else {
					 return;
				 }
			 }
		 }
	 }
	
	//A method to remove a student from the studentList
	 public void removeStudent(Student target) {
		Object location = searchStudentList(target);
		//if location is not equal to -1
		 if (location != -1) {
			//remove from studentList
			 for (int i = 0; i < enrolledStudent; i++) {
			//--update element at location to element at numStud-1
				 if (students[i] == target) {
		 	//--update element at numStud-1 to null
					 students[i-1] = null;
			//--update the numStud
					 enrolledStudent--;
			//--print remove from the course
					 System.out.println("Student removed from course.");
			//move one element from the waitList to studentList if waitList is not empty
					 if (waitStudent > 0) {
			//--add waitList[0] to studentList
						 students[enrolledStudent] = waitlist[0];
						 waitStudent--;
			//--shift all remaining elements one spot to the left
						 for (int n = 0; n < waitStudent; n++) {
							 waitlist[n] = waitlist[n + 1];
						 }
					 }
				 }
			 }
		 } else if (location = searchStudentList(target)) {
			//if location is not equal to -1
			 if (location != -1) {
			//remove from the waitList
				 for (int i = 0; i < waitStudent; i++) {
			//--update element at location to element at numWait-1
					 if (waitlist[i] == target) {
			//--update element at numWait-1 to null
						 waitlist[i-1] = null;
			//--update the numWait
						 waitStudent--;
			//--print remove from the waitList
						 System.out.println("Student removed from course waitlist.");
					 }
				 }
			 }
		 }
	}
	 
	 public void printStudentList() {
		 if (enrolledStudent > 0) {
			 //for loop upper bouns by numStud
			 for (int i = 0; i < enrolledStudent; i++) {
				 System.out.print(students[i] + " ");
				 }
		 } else {
			 System.out.println("No students are currently enrolled in course.");
		 }
	}
	 
	 public void printWaitList() {
		 if (enrolledStudent > 0) {
			 //for loop upper bouns by numStud
			 for (int i = 0; i < waitStudent; i++) {
				 System.out.print(waitlist[i] + " ");
			 } 
		 } else {
			 System.out.println("No students are currently enrolled in course's waitlist.");
		 }
	}
	 
}
