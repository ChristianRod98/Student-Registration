
public class Instructor extends Person {
	//implement the constructor method, inherited from the person class
	String name;
	String id;
	
	public Instructor(String name, String id) {
		super(name, id);
		this.name = name;
		this.id = id;
	   }
	
	@Override
	public String toString() {
		return "name=" + name + ", id= " + id;
	}
}
