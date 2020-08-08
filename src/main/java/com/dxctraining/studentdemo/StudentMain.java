package studentdemo;

import java.util.*;

public class StudentMain {
	Map<String,Student> studentmap=new HashMap<>();
	Set<Student> studentset1=new HashSet<>();
	Set<Student> studentset2=new HashSet<>();
	List<String> list=new ArrayList<>();
	public static void main(String args[]) {
		StudentMain demo = new StudentMain();
		demo.runApp();
	}

	public void runApp() {
		
		Student student1 = new Student("student1", 22);
		Student student2 = new Student("student2",23);
		Student student3 = new Student("student3",24);
		Student student4 = new Student("student4",21);
		Student student5 = new Student("student5",20);
		
		studentmap.put("student1",student1);
		studentmap.put("student2",student2);
		studentmap.put("student3",student3);
		studentmap.put("student4",student4);
		studentmap.put("student5",student5);
	
		
		
		Set<String>keys=studentmap.keySet();
		for(String key:keys) {
			Student data=studentmap.get(keys);
			int a=data.getAge();
			if(a%2==0){
				studentset1.add(data);
			}
			else {
				studentset2.add(data);
			}
		
			list.add(data.getRollno());
			}
			display();
		}
	
		private void display() {
			System.out.println("####Even Age Student####");
			for(Student student:studentset1) {
				System.out.println("Rollno :"+student.getRollno()+"Age :"+student.getAge());
			}
			System.out.println("####Odd Age Students####");
			for(Student student:studentset2) {
				System.out.println("Rollno :"+student.getRollno()+"Age :"+student.getAge());
			}
			System.out.println("####Students all Rollnos ####");
			for(String student:list) {
				System.out.println(student);
			}
			
			
		}

	
}