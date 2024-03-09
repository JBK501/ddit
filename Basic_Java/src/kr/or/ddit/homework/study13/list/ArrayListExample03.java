package kr.or.ddit.homework.study13.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample03 {
	public static void main(String[] args) {

		List<Student> li = new ArrayList<Student>();

		li.add(new Student("n1", "10"));
		li.add(new Student("n2", "20"));
		li.add(new Student("n3", "50"));
		
		for(Student st : li) {
			if(st.name.equals("n2"))
				System.out.println(st.age);
		}
		
		Student st2 = (Student)li.remove(1);
		System.out.println(st2);
	}
}

class Student {
	String name;
	String age;

	public Student(String name, String age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
	

}