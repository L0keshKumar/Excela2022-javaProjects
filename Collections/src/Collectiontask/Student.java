package Collectiontask;

public class Student implements Comparable<Student>
{

	private int studentId;
	private String studentName;
	private long mark;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int studentId, String studentName, long mark) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.mark = mark;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public long getMark() {
		return mark;
	}
	public void setMark(long mark) {
		this.mark = mark;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (mark ^ (mark >>> 32));
		result = prime * result + studentId;
		result = prime * result + ((studentName == null) ? 0 : studentName.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (mark != other.mark)
			return false;
		if (studentId != other.studentId)
			return false;
		if (studentName == null) {
			if (other.studentName != null)
				return false;
		} else if (!studentName.equals(other.studentName))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", mark=" + mark + "]";
	}
	@Override
	public int compareTo(Student arg0) {
		if(this.studentId==arg0.studentId)return 0;
		return 1;
		
	}
	
}
