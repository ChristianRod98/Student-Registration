
public class Person {
 //common field from Student and Instructor class
	String name;
	String id;
 //common method from Student and Instructor class 
	public Person(String name, String id) {
		super();
		this.name = name;
		this.id = id;
		}
	
	@Override
	public String toString() {
		return "name=" + name + ", id= " + id;
	}
}
