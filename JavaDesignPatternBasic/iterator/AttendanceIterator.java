package iterator;

public class AttendanceIterator implements iterator.Iterator{
	private Attendance attendance;
	private int index;
	
	public AttendanceIterator(Attendance attandance) {
		this.attendance = attandance;
		this.index = 0;
	}
	public boolean hasNext() {
		if(index < attendance.getPeopleCount()) {
			return true;
		} else {
			return false;
		}
	}
	public Object next() {
		Student student = attendance.getStudents(index);
		index++;
		return student;
	}
}
