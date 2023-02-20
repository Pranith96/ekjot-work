
public class Student {

	private int studentId;
	private String studentName;
	private String rollNumber;

	public Student(int studentId, String studentName, String rollNumber) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.rollNumber = rollNumber;
	}

	public Student() {
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public int getStudentId() {
		return studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(String rollNumber) {
		this.rollNumber = rollNumber;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", rollNumber=" + rollNumber
				+ "]";
	}

}
