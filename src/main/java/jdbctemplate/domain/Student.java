package jdbctemplate.domain;

public class Student {
	
	private int Id;
	private String first_name;
	private String second_name;
	private String course;
	private int age;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getSecond_name() {
		return second_name;
	}
	public void setSecond_name(String second_name) {
		this.second_name = second_name;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [Id=" + Id + ", first_name=" + first_name + ", second_name=" + second_name + ", course="
				+ course + ", age=" + age + "]";
	}
	

}
