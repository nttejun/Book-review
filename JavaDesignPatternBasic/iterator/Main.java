package iterator;

import java.util.Iterator;

public class Main {
	public static void main(String[] args) {
	Attendance attandance = new Attendance(4);
	attandance.addStudent(new Student("Ello"));
	attandance.addStudent(new Student("Bito"));
	attandance.addStudent(new Student("Kirra"));
	attandance.addStudent(new Student("Bigger"));
	
	//순서대로출력
	iterator.Iterator iterator = attandance.iterator();
	while(iterator.hasNext()) {
		Student student = (Student) iterator.next();
		System.out.println(student.getName());
	}
	}
}
