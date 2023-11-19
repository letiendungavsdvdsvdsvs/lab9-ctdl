package Task1;

import java.util.List;

public class Course implements Comparable<Course>{
	private String id;
	private String title;
	private String type;
	private String lecturer;
	private List<Student> students;
	public Course(String id, String title, String type, String lecturer, List<Student> students) {
		this.id = id;
		this.title = title;
		this.type = type;
		this.lecturer = lecturer;
		this.students = students;
	}
	@Override
	public int compareTo(Course o) {
		return -(students.size()-o.students.size());
	}
	public String getType() {
		return type;
	}
	public List<Student> getStudents(){
		return students;
	}
	public boolean equal(Course o) {
		return getId()==o.getId();
	}
	public String getId() {
		return id;
	}
}
