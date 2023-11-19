package Task1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Faculty {
	private String name;
	private String address;
	private List<Course> courses;
	public Faculty(String name, String address, List<Course> courses) {
		this.name = name;
		this.address = address;
		this.courses = courses;
	}
	 public Course getMaxPracticalCourse() {
		 Collections.sort(courses);
		 for (Course course : courses) {
			if(course.getType().equalsIgnoreCase("Thuc Hanh")) {
				return course;
			}
		}
		return null;
	 }
	 public Map<Integer, List<Student>> groupStudentsByYear(){
		 Map<Integer, List<Student>> re = new HashMap<Integer, List<Student>>();
		 for (Course course : courses) {
			for (Student student : course.getStudents()) {
				 List<Student> students = new ArrayList<Student>();
				for (Student student2 : students) {
					if(student.equal(student2)) {
						continue;
					}
					if(student.getYear()==student2.getYear()) {
						students.add(student);
						re.put(student.getYear(), students);
					}
				}
				
			}
		}
		return re;
	 }
	 public Set<Course> filterCourses(String type){
		 Set<Course> re = new HashSet<Course>();
		 Course c = null;
		 for (Course course : courses) {
			if(!(course==null)) {
				c=course;
				if(!re.contains(c)) {
					continue;
				}else {
					re.add(c);
				}
			}
			
		}
		 return re;
	 }
}
