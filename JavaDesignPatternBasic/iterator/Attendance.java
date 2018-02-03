package iterator;

public class Attendance implements Aggregate {
	private Student[] students;
	private int count = 0;
	
	public Attendance(int persons) {
		this.students = new Student[persons];
	}
	public Student getStudents(int index) {
		return students[index];
	}
	
	//학생추가
	public void addStudent(Student student) {
		this.students[count] = student;
		count++;
	}
	
	public int getPeopleCount() {
		return count;
	}
	
	public Iterator iterator() {
		return new AttendanceIterator(this);
	}
}
