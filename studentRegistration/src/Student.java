
public class Student extends Person {
//add component here for inheritance
//implement the constructor method, inherited from the person class
	String name;
	String id;
	
	public Student(String name, String id) {
		super(name, id);
		this.name = name;
		this.id = id;
	   }

	   public String getName() {
	       return name;
	   }

	   public String getid() {
	       return id;
	   }

//override toString
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if (obj != null && obj instanceof Student) {
			Student student = (Student) obj;
			return name.equals(student.getName()) && id == student.getid();
	       } else {
	           return false;
	       }
	}
	
}
